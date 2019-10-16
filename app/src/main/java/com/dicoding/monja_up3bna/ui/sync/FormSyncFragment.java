package com.dicoding.monja_up3bna.ui.sync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dicoding.monja_up3bna.R;

public class FormSyncFragment extends Fragment {

    private FormSyncViewModel formSyncViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        formSyncViewModel = ViewModelProviders.of( this ).get( FormSyncViewModel.class );
        View root = inflater.inflate( R.layout.fragment_form_sync,container,false );
        final TextView textView = root.findViewById( R.id.text_sync );
        formSyncViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText( s );
            }
        } );

        return root;
    }
}
