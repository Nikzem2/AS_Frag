package com.example.kursach2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.NoActionBarForNewWindows);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_setting);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
