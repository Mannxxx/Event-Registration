package com.example.sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView fg;
EditText user,pass;
Button login,reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.editText);
        pass=findViewById(R.id.editText2);
        login=findViewById(R.id.button);
        reg=findViewById(R.id.button2);
        fg=findViewById(R.id.textView);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().length()!=0 && pass.getText().toString().length()!=0) {
                    Intent obj = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(obj);
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoreg = new Intent(MainActivity.this, registration.class);
                startActivity(gotoreg);
                finish();
            }
        });

        fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(MainActivity.this , ForgetPassword.class);
                startActivity(obj2);
            }
        });
    }
}
