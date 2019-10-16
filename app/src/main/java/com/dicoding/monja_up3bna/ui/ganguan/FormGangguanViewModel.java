package com.dicoding.monja_up3bna.ui.ganguan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormGangguanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormGangguanViewModel() {
        mText = new MutableLiveData<>(  );
        mText.postValue( "Form Gangguan Fragment " );
    }

    public LiveData<String> getText(){
        return mText;
    }
}
