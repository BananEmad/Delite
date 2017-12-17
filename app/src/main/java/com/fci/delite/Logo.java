package com.fci.delite;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Logo extends AppCompatActivity {
    private static  int Splash_time_out=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent homeIntent=new Intent(Logo.this,SignU.class);
                startActivity(homeIntent);
                finish();
            }
        },Splash_time_out);
    }
}
