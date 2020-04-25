package com.example.kursach2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class Spisok_rec extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.NoActionBarForNewWindows);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_spisok_rec);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
