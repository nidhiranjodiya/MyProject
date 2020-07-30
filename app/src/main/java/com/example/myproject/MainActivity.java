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


    private static int SPLASH_SCREEN = 5000;

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView logo;

    ImageView img;
    AnimationDrawable frameAnimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView1);
        logo = findViewById(R.id.textView8);


        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);





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
