package com.example.androidprogramming.Stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.example.androidprogramming.R;

import java.util.Locale;

public class StopwatchActivity extends Activity implements View.OnClickListener {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }

        findViewById(R.id.start_button).setOnClickListener(this);
        findViewById(R.id.stop_button).setOnClickListener(this);
        findViewById(R.id.reset_button).setOnClickListener(this);

        runTimer();
    }

    @Override
    public void onSaveInstanceState (Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_button:
                running = true;
                break;
            case R.id.stop_button:
                running = false;
                break;
            case R.id.reset_button:
                running = false;
                seconds = 0;
                break;
        }
    }

    private void runTimer() {
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;

                String time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);

                if (running) {
                    seconds++;
                }

                handler.postDelayed(this, 1000);
            }
        });
    }
}