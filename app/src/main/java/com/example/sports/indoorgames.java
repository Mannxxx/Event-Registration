package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class indoorgames extends AppCompatActivity {
ImageButton carrom,chess, tennis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indoorgames);
        carrom=findViewById(R.id.ca);
        chess=findViewById(R.id.ch);
        tennis=findViewById(R.id.tt);
        carrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carromIntent = new Intent(indoorgames.this,carrom.class);
                startActivity(carromIntent);
            }
        });
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chessIntent = new Intent(indoorgames.this,chess.class);
                startActivity(chessIntent);
            }
        });
        tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tennisIntent = new Intent(indoorgames.this,tabletennis.class);
                startActivity(tennisIntent);
            }
        });
    }
}
