package com.example.navigationdrawer.ui.principal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrincipalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PrincipalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Principal");
    }

    public LiveData<String> getText() {
        return mText;
    }
}