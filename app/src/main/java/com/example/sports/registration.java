package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class registration extends AppCompatActivity {

   // Button reg,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

//        reg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(registration.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
//
//                Intent registered  = new Intent(registration.this,MainActivity.class);
//                startActivity(registered);
//                finish();
//            }
//        });
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent backtomain = new Intent(registration.this, MainActivity.class);
//                startActivity(backtomain);
//                finish();
//            }
//        });
    }
}