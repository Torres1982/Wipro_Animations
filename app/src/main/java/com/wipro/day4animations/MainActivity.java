package com.wipro.day4animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scaleTextView;
    private TextView rotateTextView;
    private TextView translateTextView;
    private TextView alphaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scaleTextView = findViewById(R.id.text_view_scale);
        rotateTextView = findViewById(R.id.text_view_rotate);
        translateTextView = findViewById(R.id.text_view_translate);
        alphaTextView = findViewById(R.id.text_view_alpha);
        Button scaleButton = findViewById(R.id.button_scale);
        Button rotateButton = findViewById(R.id.button_rotate);
        Button translateButton = findViewById(R.id.button_translate);
        Button alphaButton = findViewById(R.id.button_alpha);

        scaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                scaleTextView.startAnimation(animation);
            }
        });

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                rotateTextView.startAnimation(animation);
            }
        });

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                translateTextView.startAnimation(animation);
            }
        });

        alphaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                alphaTextView.startAnimation(animation);
            }
        });
    }
}
