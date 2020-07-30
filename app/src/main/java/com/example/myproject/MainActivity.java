package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView img;
    AnimationDrawable frameAnimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Animation
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.imageView);

        img.setBackgroundResource(R.drawable.animation1);

        frameAnimation = (AnimationDrawable) img.getBackground();


    }

    @Override

     public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (hasFocus) {
           frameAnimation.start();
       } else {
           frameAnimation.stop();
       }
    }
}
