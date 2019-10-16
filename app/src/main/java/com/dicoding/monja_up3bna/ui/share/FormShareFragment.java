package com.dicoding.monja_up3bna.ui.share;

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

public class FormShareFragment extends Fragment {

    private FormShareViewModel formShareViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        formShareViewModel = ViewModelProviders.of(this).get( FormShareViewModel.class );
        View root = inflater.inflate( R.layout.fragment_share,container,false );
        final TextView textView = root.findViewById( R.id.text_share );
        formShareViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText( s );
            }
        } );

        return root;
    }
}
