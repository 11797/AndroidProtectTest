package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;



    public class Plist_test extends DialogFragment {
        RadioGroup radioGroup;
        public static final String TAG = Plist_test.class.getSimpleName();
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
           // setStyle(DialogFragment.STYLE_NO_TITLE, R.style.NewDialogFullScreen/*WbxDialogFragment*/);
            //setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
            setStyle(DialogFragment.STYLE_NORMAL, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveIn){
            View view = inflater.inflate(R.layout.plist_test, container);
            radioGroup = view.findViewById(R.id.radioGroup);
            initView();
            return view;

        }

        private void initView(){
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    switch(radioGroup.getCheckedRadioButtonId()){
                        case R.id.msbt:
                            Toast.makeText(getContext(),"sss",Toast.LENGTH_SHORT).show();
//                            main_test();
                            break;


                        case R.id.bobt:
                            Toast.makeText(getContext(),"gggg",Toast.LENGTH_SHORT).show();
//                            Breakout_test();
                            break;
                    }

                }
            });



        }

//        private void main_test(){
//            Fragment main= new ParticipantsDialog();
//            androidx.fragment.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
//            ft.replace(R.id.fragment_container,main,"MainSession");
//            ft.commitNow();
//        }
//        private void Breakout_test(){
//            Fragment bo = new KBOSessionListFragment();
//            androidx.fragment.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
//            ft.replace(R.id.fragment_container,bo,"MainSession");
//            ft.commitNow();
//        }
}
