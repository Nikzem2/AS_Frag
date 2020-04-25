package com.example.kursach2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Add_ing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.NoActionBarForNewWindows);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_add_ing);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
