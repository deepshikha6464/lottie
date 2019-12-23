package com.example.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    LottieAnimationView bookark, edit, load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookark = findViewById(R.id.book);
        edit = findViewById(R.id.edit);
        load = findViewById(R.id.load);
    }

    public void bookmarkClick(View view) {
        bookark.setProgress(0);
        bookark.pauseAnimation();
        bookark.playAnimation();
            }

    public void editClick(View view) {
        edit.setProgress(0);
        edit.pauseAnimation();
        edit.playAnimation();
    }

    public void loadClick(View view) {
        load.setProgress(0);
        load.pauseAnimation();
        load.playAnimation();

    }
}
