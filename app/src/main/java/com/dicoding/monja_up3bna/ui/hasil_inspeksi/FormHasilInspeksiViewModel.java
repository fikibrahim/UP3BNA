package com.dicoding.monja_up3bna.ui.hasil_inspeksi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormHasilInspeksiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

   public FormHasilInspeksiViewModel() {
       mText = new MutableLiveData<>(  );
       mText.setValue( "Form Hasil Infeksi Fragment" );
   }

    public LiveData<String> getText() {
        return mText;
    }
}
