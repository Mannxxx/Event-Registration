package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
ImageButton indoor,outdoor;
TextView term;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        indoor= findViewById(R.id.ind);
        outdoor=findViewById(R.id.out);
        term = findViewById(R.id.terms);
        indoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Main2Activity.this,indoorgames.class);
                startActivity(in);
            }
        });
        outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        term.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ter = new Intent(Main2Activity.this,TermsAndCondition.class);
                startActivity(ter);
            }
        });
    }
}
