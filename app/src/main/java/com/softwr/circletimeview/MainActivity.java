package com.softwr.circletimeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.softwr.softtimeview.CircularSliderView;
import com.softwr.softtimeview.CircularTimerClock;

public class MainActivity extends AppCompatActivity {
    CircularSliderView circularSliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting programatically programatically
        circularSliderView = findViewById(R.id.circular_clock);
        initClock(0,6);

    }

    private void initClock(int start,int end) {

        start = start * 60;
        end = end * 60;

        int startHour = start / 60;
        int endHour = end / 60;

        double startMinute = 10 % 60;
        double endMinute = 1 % 60;

        if(startHour > 12){
            startHour -= 12;
        }

        if(endHour > 12){
            endHour -= 12;
        }

        startMinute = startMinute / 2;
        endMinute = endMinute / 2;

        double startAngle = ((startHour-3)*30) + startMinute;
        double endAngle = ((endHour-3)*30) + endMinute;

        circularSliderView.setStartAngle(startAngle);
        circularSliderView.setEndAngle(endAngle);
        circularSliderView.invalidate();
        // clock.invalidate();

    }
}