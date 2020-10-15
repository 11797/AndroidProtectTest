package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_main = (Button)findViewById(R.id.mainSession);
        Button bt_break=(Button)findViewById(R.id.breakoutSession);
        bt_break.setOnClickListener(this);
        bt_main.setOnClickListener(this);
        replaceFragment(new MainFragment());

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.mainSession:
                replaceFragment(new MainFragment());
                break;
            case R.id.breakoutSession:
                replaceFragment(new BreakSession_Fragment());
                break;
             default:
                 break;
        }

    }
    private void replaceFragment(Fragment fragment){
        FragmentManager FragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = FragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,fragment);
        fragmentTransaction.commit();
    }
}
