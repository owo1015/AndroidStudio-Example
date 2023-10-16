package com.example.androidprogramming.Flashlight;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.androidprogramming.R;

public class FlashlightActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight);

        Button white = findViewById(R.id.button_white);
        Button gray = findViewById(R.id.button_gray);
        Button red = findViewById(R.id.button_red);
        Button green = findViewById(R.id.button_green);
        Button blue = findViewById(R.id.button_blue);

        white.setOnClickListener(this);
        gray.setOnClickListener(this);
        red.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        LinearLayout background = findViewById(R.id.background);

        switch(view.getId()) {
            case R.id.button_white:
                background.setBackgroundColor(Color.WHITE);
                break;
            case R.id.button_gray:
                background.setBackgroundColor(Color.GRAY);
                break;
            case R.id.button_red:
                background.setBackgroundColor(Color.RED);
                break;
            case R.id.button_green:
                background.setBackgroundColor(Color.GREEN);
                break;
            case R.id.button_blue:
                background.setBackgroundColor(Color.BLUE);
                break;
        }
    }
}