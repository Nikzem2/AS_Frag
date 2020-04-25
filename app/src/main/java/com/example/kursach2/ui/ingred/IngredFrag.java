package com.example.kursach2.ui.ingred;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.kursach2.R;

public class IngredFrag extends Fragment {


    private IngredViewModel IngredViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        IngredViewModel =
                ViewModelProviders.of(this).get(IngredViewModel.class);
        View root = inflater.inflate(R.layout.ingred, container, false);

        return root;
    }
}