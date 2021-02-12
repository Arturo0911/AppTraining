package com.example.trainingregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.chip.Chip;

public class MainPanel extends AppCompatActivity {

    private Chip chipChineeseFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_panel);
        chipChineeseFood = (Chip) findViewById(R.id.chipChineeseFood);

    }


}