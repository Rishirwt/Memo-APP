package com.example.dell.memoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class splashactivity extends AppCompatActivity {

    int SPLASH_TIME=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        new Handler().postDelayed(new Runnable() {



            @Override
            public void run() {
                Intent i = new Intent(splashactivity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME);

    }
}
