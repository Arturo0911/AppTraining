package com.example.trainingregister.process;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

/**
 * @author Arturo Negreiros Samanez
 * */

public class Validation extends AppCompatActivity {

    public boolean checkFields(String name, String lastName){

        return !name.equals("") && !lastName.equals("");

    }

    public void clearFields(TextInputEditText name, TextInputEditText lastName){

        name.setText("");
        lastName.setText("");
    }
}
