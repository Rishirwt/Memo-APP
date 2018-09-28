package com.example.dell.memoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class splashactivity extends AppCompatActivity {

    int SPLASH_TIME=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashactivity);
        getSupportActionBar().hide();
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
