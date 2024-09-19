package com.example.animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class BlinckActivity extends AppCompatActivity {
    private Button startBtn;
    private Button pauseBtn;
    private  ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        img = findViewById(R.id.img_blink);
        startBtn=findViewById(R.id.starttween);
        pauseBtn=findViewById(R.id.pausetween);

        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);

        Animation move = AnimationUtils.loadAnimation(this, R.anim.move_animation);

        pauseBtn.startAnimation(move);
        startBtn.startAnimation(move);
        img.startAnimation(move);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              img.startAnimation(blinkAnimation);
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 img.clearAnimation();
            }
        });





    }
}