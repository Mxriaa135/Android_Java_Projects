package com.example.navigationdrawer.ui.servicos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServicosViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ServicosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Serviços");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
