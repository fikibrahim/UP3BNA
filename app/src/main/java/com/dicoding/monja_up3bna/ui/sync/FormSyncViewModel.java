package com.dicoding.monja_up3bna.ui.sync;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormSyncViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormSyncViewModel() {
        mText = new MutableLiveData<>(  );
        mText.setValue( "Form Sync Fragment" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}
