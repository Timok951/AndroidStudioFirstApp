package com.example.animation;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RabitActivity extends AppCompatActivity {
    private ImageView animationIV;
    private Button startBtn;
    private Button pauseBtn;
    private AnimationDrawable frameAnimation;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabit);
        Animation startanimation = AnimationUtils.loadAnimation(this, R.anim.rabit_animation);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);

        startBtn.startAnimation(startanimation);
        pauseBtn.startAnimation(startanimation);
        animationIV.startAnimation(startanimation);

        frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        startBtn.setOnClickListener(v ->{
            if(!frameAnimation.isRunning()){
                frameAnimation.start();
            }
        });

        pauseBtn.setOnClickListener(v ->{
            if(frameAnimation.isRunning()){
                frameAnimation.stop();
            }
        });

    }
}