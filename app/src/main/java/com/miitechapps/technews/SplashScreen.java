package com.miitechapps.technews;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 999999990;

    View first,second,third,fourth,fifth,sixth;
    TextView develop, tech;
    Button btn_awal;

    Animation topAnim, bottomAnim, middleAnim, topAnim2,topAnim3,topAnim4,topAnim5,topAnim6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Button button = (Button)findViewById(R.id.btn_awal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        topAnim2 = AnimationUtils.loadAnimation(this,R.anim.top_anim2);
        topAnim3 = AnimationUtils.loadAnimation(this,R.anim.top_anim3);
        topAnim4 = AnimationUtils.loadAnimation(this,R.anim.top_anim4);
        topAnim5 = AnimationUtils.loadAnimation(this,R.anim.top_anim5);
        topAnim6 = AnimationUtils.loadAnimation(this,R.anim.top_anim6);
        middleAnim = AnimationUtils.loadAnimation(this,R.anim.middle_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        first = findViewById(R.id.first_line);
        second = findViewById(R.id.second_line);
        third = findViewById(R.id.third_line);
        fourth = findViewById(R.id.fourth_line);
        fifth = findViewById(R.id.fifth_line);
        sixth = findViewById(R.id.sixth_line);

        develop = findViewById(R.id.develop);
        tech = findViewById(R.id.tech);
        btn_awal = findViewById(R.id.btn_awal);

        first.setAnimation(topAnim);
        second.setAnimation(topAnim2);
        third.setAnimation(topAnim3);
        fourth.setAnimation(topAnim4);
        fifth.setAnimation(topAnim5);
        sixth.setAnimation(topAnim6);

        tech.setAnimation(middleAnim);
        develop.setAnimation(bottomAnim);
        btn_awal.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
