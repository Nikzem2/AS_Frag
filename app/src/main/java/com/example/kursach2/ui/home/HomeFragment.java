package com.example.kursach2.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.kursach2.Spisok_rec;
import com.example.kursach2.Add_rec;
import com.example.kursach2.Spisok_ing;
import com.example.kursach2.Add_ing;
import com.example.kursach2.Setting;
import com.example.kursach2.R;
import com.example.kursach2.ui.ingred.IngredFrag;
import com.example.kursach2.ui.recept.ReceptFrag;

public class HomeFragment extends Fragment implements View.OnClickListener
{

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.home, container, false);
        //Рецепты
        Button spisok_rec = root.findViewById(R.id.btnsprec);
        spisok_rec.setOnClickListener(this);
        //Список ингредиентов
        Button spisok_ing = root.findViewById(R.id.btnsping);
        spisok_ing.setOnClickListener(this);
        //Настройки
        Button setting = root.findViewById(R.id.btnset);
        setting.setOnClickListener(this);


        return root;
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnsprec) {
            Intent intent = new Intent(view.getContext(), ReceptFrag.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.btnsping){
            Intent intent = new Intent(view.getContext(), IngredFrag.class);
            startActivity(intent);
        }

        else if (view.getId() == R.id.btnset){
            Intent intent = new Intent(view.getContext(), Setting.class);
            startActivity(intent);
        }

    }
}








