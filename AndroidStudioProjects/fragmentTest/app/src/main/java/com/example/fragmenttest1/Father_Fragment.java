package com.example.fragmenttest1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Father_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saceInstanceState){
        View view=inflater.inflate(R.layout.father_fragment,container,false);
        return view;

    }
}
