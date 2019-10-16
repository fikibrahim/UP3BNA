package com.dicoding.monja_up3bna.ui.inspeksi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormInspeksiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormInspeksiViewModel() {
        mText = new MutableLiveData<>(  );
        mText.setValue( "Form Inspeksi Fragment" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}
