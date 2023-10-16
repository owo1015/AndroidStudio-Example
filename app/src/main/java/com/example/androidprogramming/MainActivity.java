package com.example.androidprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidprogramming.BeerAdviser.FindBeerActivity;
import com.example.androidprogramming.Dice.DiceActivity;
import com.example.androidprogramming.Flashlight.FlashlightActivity;
import com.example.androidprogramming.MyMessenger.CreateMessageActivity;
import com.example.androidprogramming.Stopwatch.StopwatchActivity;
import com.example.androidprogramming.Workout.WorkoutActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_beer_adviser).setOnClickListener(this);
        findViewById(R.id.btn_my_messenger).setOnClickListener(this);
        findViewById(R.id.btn_dice).setOnClickListener(this);
        findViewById(R.id.btn_flashlight).setOnClickListener(this);
        findViewById(R.id.btn_stopwatch).setOnClickListener(this);
        findViewById(R.id.btn_workout).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_beer_adviser:
                Intent intent1 = new Intent(this, FindBeerActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_my_messenger:
                Intent intent2 = new Intent(this, CreateMessageActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_dice:
                Intent intent3 = new Intent(this, DiceActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_flashlight:
                Intent intent4 = new Intent(this, FlashlightActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_stopwatch:
                Intent intent5 = new Intent(this, StopwatchActivity.class);
                startActivity(intent5);
                break;
            case R.id.btn_workout:
                Intent intent6 = new Intent(this, WorkoutActivity.class);
                startActivity(intent6);
                break;
        }
    }
}