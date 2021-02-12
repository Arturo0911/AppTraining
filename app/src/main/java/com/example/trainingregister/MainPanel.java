package com.example.trainingregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputEditText;

public class MainPanel extends AppCompatActivity {

    private Spinner spinnerTypeTraining;
    private TextInputEditText currentDateField;
    private TextInputEditText heightField;
    private TextInputEditText weightField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_panel);

        currentDateField = (TextInputEditText) findViewById(R.id.currentDateField);
        heightField = (TextInputEditText) findViewById(R.id.heightField);
        weightField = (TextInputEditText) findViewById(R.id.weightField);

        spinnerTypeTraining = (Spinner) findViewById(R.id.spinnerTypeTraining);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(MainPanel.this, R.array.typetraining, R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerTypeTraining.setAdapter(arrayAdapter);
    }


}