package com.example.navigationdrawer.ui.clientes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClientesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ClientesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Clientes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}