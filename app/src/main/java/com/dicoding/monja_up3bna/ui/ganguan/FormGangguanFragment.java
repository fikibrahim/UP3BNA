package com.dicoding.monja_up3bna.ui.ganguan;

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

public class FormGangguanFragment extends Fragment {

    private FormGangguanViewModel formGangguanViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        formGangguanViewModel = ViewModelProviders.of( this ).get( FormGangguanViewModel.class );
        View root = inflater.inflate( R.layout.fragment_form_gangguan,container,false );
        final TextView textView = root.findViewById( R.id.text_gangguan );

        formGangguanViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText( s );
            }
        } );

        return root;
    }
}
