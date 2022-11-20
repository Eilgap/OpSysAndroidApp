package com.example.operatingsystemsapplication.ui.chapter2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Chapter2ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Chapter2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}