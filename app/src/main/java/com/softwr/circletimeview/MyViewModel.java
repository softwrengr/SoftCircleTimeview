package com.softwr.circletimeview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MyViewModel extends LiveData {

    public MutableLiveData<Integer> date = new MutableLiveData<>();


    public MutableLiveData<Integer> getDate(){
        return date;
    }

}
