package com.dicoding.monja_up3bna.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormShareViewModel extends ViewModel {

    private MutableLiveData<String > mText;

    public FormShareViewModel() {
        mText = new MutableLiveData<>(  );
        mText.setValue( "Form Share Fragment" );
    }

    public LiveData<String> getText(){
        return mText;
    }
}
