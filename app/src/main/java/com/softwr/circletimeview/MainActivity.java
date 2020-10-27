package com.softwr.circletimeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.softwr.softtimeview.CircularTimerClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircularTimerClock circularTimerClock = findViewById(R.id.circular_clock);
        circularTimerClock.setStartHour(12);
        circularTimerClock.setEndHour(5);
        circularTimerClock.setStartMinutes(0);
        circularTimerClock.setEndMinutes(0);
        circularTimerClock.init();
    }
}