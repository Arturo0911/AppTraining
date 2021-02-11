package com.example.trainingregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText userField;
    private TextInputEditText passField;


    public void initLoginButton(View view){

        //Toast.makeText(MainActivity.this, "Hola amorcito bello", Toast.LENGTH_SHORT).show();
        String user = userField.getText().toString();
        String pass = passField.getText().toString();


        Toast.makeText(this, "usuario: "+userField.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userField = (TextInputEditText) findViewById(R.id.userField);
        passField = (TextInputEditText) findViewById(R.id.passField);


    }
}