package com.example.android.tflitecamerademo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ImageView;

public class InfoActivity extends AppCompatActivity {
//    ImageView img = (ImageView) findViewById(R.id.explain);
//    int num = (int)(Math.random()*2);
    int num = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        if (num == 0)
//            img.setImageDrawable(getResources().getDrawable(R.drawable.bongwan));
//        else
//            img.setImageResource(R.drawable.bongwan);

        setContentView(R.layout.dialog01);


    }
}