package com.dicoding.monja_up3bna.ui.tentang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormTentangViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormTentangViewModel() {
        mText = new MutableLiveData<>(  );
        mText.setValue( "Form Tentang Fragment" );
    }

    public LiveData<String> getText() {
        return mText;
    }

}
