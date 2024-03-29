package com.dicoding.monja_up3bna.ui.hasil_gangguan;


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
public class FormHasilGangguanFragment extends Fragment {

    private FormHasilGangguanViewModel formHasilGangguanViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        formHasilGangguanViewModel = ViewModelProviders.of( this ).get( FormHasilGangguanViewModel.class );
        View root = inflater.inflate( R.layout.fragment_form_hasil_gangguan,container,false );
        final TextView textView = root.findViewById( R.id.text_hasil_gangguan );

        formHasilGangguanViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText( s );
            }
        } );

        return root;
    }

}
