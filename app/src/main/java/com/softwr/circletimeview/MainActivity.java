package com.softwr.circletimeview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.database.DatabaseUtils;
import android.os.Bundle;

import com.softwr.circletimeview.databinding.ActivityMainBinding;
import com.softwr.softtimeview.CircularSliderView;
import com.softwr.softtimeview.CircularTimerClock;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //MyViewModel myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        //myViewModel.date.setValue(7);

        binding.circularClock.init(12,6,20,30);

    }
}