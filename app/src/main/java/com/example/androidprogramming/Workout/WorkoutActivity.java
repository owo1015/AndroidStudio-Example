package com.example.androidprogramming.Workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidprogramming.R;

public class WorkoutActivity extends AppCompatActivity implements WorkoutListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(WorkoutActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
        startActivity(intent);
    }
}