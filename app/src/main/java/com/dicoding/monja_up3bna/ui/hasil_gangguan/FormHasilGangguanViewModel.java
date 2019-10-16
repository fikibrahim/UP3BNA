package com.dicoding.monja_up3bna.ui.hasil_gangguan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormHasilGangguanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormHasilGangguanViewModel() {
        mText = new MutableLiveData<>(  );
        mText.postValue( "Form Hasil Gangguan Fragment " );
    }

    public LiveData<String> getText(){
        return mText;
    }
}
