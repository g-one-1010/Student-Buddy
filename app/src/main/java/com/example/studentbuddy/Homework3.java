package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homework3 extends AppCompatActivity implements View.OnClickListener {

    private Button btnEng3, btnMath3, btnSci3, btnBack3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3);

        btnEng3 = findViewById(R.id.btnEng3);
        btnMath3 = findViewById(R.id.btnMath3);
        btnSci3 = findViewById(R.id.btnSci3);
        btnBack3 = findViewById(R.id.btnBack3);

        btnEng3.setOnClickListener(this);
        btnMath3.setOnClickListener(this);
        btnSci3.setOnClickListener(this);
        btnBack3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEng3:{
                startActivity(new Intent(Homework3.this, EnglishHw3.class));
                break;
            }
            case R.id.btnMath3:{
                startActivity(new Intent(Homework3.this, MathHw3.class));
                break;
            }
            case R.id.btnSci3:{
                startActivity(new Intent(Homework3.this, ScienceHw3.class));
                break;
            }
            case R.id.btnBack3:{
                startActivity(new Intent(Homework3.this, StudentLogin3.class));
                break;
            }
            default:{
                break;
            }
        }

    }
}