package com.example.trainingregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.trainingregister.process.Validation;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nameField;
    private TextInputEditText lastNameField;
    Validation validator = null;


    public void initLoginButton(View view){

        //Toast.makeText(MainActivity.this, "Hola amorcito bello", Toast.LENGTH_SHORT).show();
        String name = nameField.getText().toString();
        String lastname = lastNameField.getText().toString();

        try {
            if (validator.checkFields(name, lastname)){
                Toast.makeText(this, "Los datos fueron guardados exitosamente.", Toast.LENGTH_SHORT).show();
                validator.clearFields(nameField, lastNameField);
            }else{
                Toast.makeText(MainActivity.this, "Los campos no pueden estar vacios", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Error: "+e.toString(), Toast.LENGTH_SHORT).show();
        }


        //Toast.makeText(this, "usuario: "+userField.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (TextInputEditText) findViewById(R.id.nameField);
        lastNameField = (TextInputEditText) findViewById(R.id.lastNameField);
        validator = new Validation();

    }
}