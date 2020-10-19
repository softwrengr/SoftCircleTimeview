package com.softwr.circletimeview;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MyViewModel extends AndroidViewModel {

    public MutableLiveData<Integer> date = new MutableLiveData<>();

    public MyViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<Integer> getDate(){
        return date;
    }

}
