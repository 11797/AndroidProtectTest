package com.example.servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View start = findViewById(R.id.start);
        View stop = findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start:
                Intent intent1=new Intent(MainActivity.this,MyService.class);
                startService(intent1);
                break;
            case R.id.stop:
                Intent intent2=new Intent(MainActivity.this,MyService.class);
                startService(intent2);
                break;
            default:
                break;
        }

    }
}
