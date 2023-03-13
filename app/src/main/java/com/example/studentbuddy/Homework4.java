package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homework4 extends AppCompatActivity implements View.OnClickListener {

    private Button btnEng4, btnMath4, btnSci4, btnBack4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework4);

        btnEng4 = findViewById(R.id.btnEng4);
        btnMath4 = findViewById(R.id.btnMath4);
        btnSci4 = findViewById(R.id.btnSci4);
        btnBack4 = findViewById(R.id.btnBack4);

        btnEng4.setOnClickListener(this);
        btnMath4.setOnClickListener(this);
        btnSci4.setOnClickListener(this);
        btnBack4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEng4:{
                startActivity(new Intent(Homework4.this, EnglishHw4.class));
                break;
            }
            case R.id.btnMath4:{
                startActivity(new Intent(Homework4.this, MathHw4.class));
                break;
            }
            case R.id.btnSci4:{
                startActivity(new Intent(Homework4.this, ScienceHw4.class));
                break;
            }
            case R.id.btnBack4:{
                startActivity(new Intent(Homework4.this, StudentLogin4.class));
                break;
            }
            default:{
                break;
            }
        }

    }
}