package com.dicoding.monja_up3bna.ui.inspeksi;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class FormInspeksiFragment extends Fragment {

    private FormInspeksiViewModel formInspeksiViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        formInspeksiViewModel = ViewModelProviders.of( this ).get(FormInspeksiViewModel.class );
        View root = inflater.inflate( R.layout.fragment_form_inspeksi,container,false );
        final TextView textView = root.findViewById( R.id.text_inspeksi );
        formInspeksiViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText( s );
            }
        } );

        return root;
    }
}
