package com.dicoding.monja_up3bna.ui.hasil_inspeksi;


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
public class FormHasilInspeksiFragment extends Fragment {

private FormHasilInspeksiViewModel formInfeksiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        formInfeksiViewModel = ViewModelProviders.of( this ).get( FormHasilInspeksiViewModel.class );
        View root = inflater.inflate( R.layout.fragment_form_hasil_inspeksi,container,false );
        final TextView textView = root.findViewById( R.id.text_hasil_inspeksi );

        formInfeksiViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText( s );
            }
        } );

        return root;

    }
}
