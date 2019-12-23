package com.example.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    LottieAnimationView bookark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookark = findViewById(R.id.book);
    }

    public void bookmarkClick(View view) {
        bookark.setProgress(0);
        bookark.pauseAnimation();
        bookark.playAnimation();
            }
}
