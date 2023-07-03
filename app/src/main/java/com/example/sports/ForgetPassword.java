package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);


        TextInputLayout til = (TextInputLayout) findViewById(R.id.emailText);
        til.setError("Enter valid mail");
        til.setError(null);
    }
}