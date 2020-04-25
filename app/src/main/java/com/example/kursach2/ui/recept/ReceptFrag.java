package com.example.kursach2.ui.recept;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.kursach2.Add_rec;
import com.example.kursach2.Spisok_rec;
import com.example.kursach2.R;

public class ReceptFrag extends Fragment implements View.OnClickListener {


    private ReceptViewModel receptViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        receptViewModel =
                ViewModelProviders.of(this).get(ReceptViewModel.class);
        View root = inflater.inflate(R.layout.recept, container, false);
        Button add_rec = root.findViewById(R.id.Add_rec);
        add_rec.setOnClickListener(this);
        Button spis_rec = root.findViewById(R.id.Spis_rec);
        spis_rec.setOnClickListener(this);


        return root;


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.Add_rec:
                Intent intent = new Intent(view.getContext(), Add_rec.class);
                startActivity(intent);
            case R.id.Spis_rec:
                Intent intent1 = new Intent(view.getContext(), Spisok_rec.class);
                startActivity(intent1);
        }


    }
}
