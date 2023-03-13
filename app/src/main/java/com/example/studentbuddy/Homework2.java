package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homework2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnEng2, btnMath2, btnSci2, btnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework2);

        btnEng2 = findViewById(R.id.btnEng2);
        btnMath2 = findViewById(R.id.btnMath2);
        btnSci2 = findViewById(R.id.btnSci2);
        btnBack2 = findViewById(R.id.btnBack2);

        btnEng2.setOnClickListener(this);
        btnMath2.setOnClickListener(this);
        btnSci2.setOnClickListener(this);
        btnBack2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEng2:{
                startActivity(new Intent(Homework2.this, EnglishHw2.class));
                break;
            }
            case R.id.btnMath2:{
                startActivity(new Intent(Homework2.this, MathHw2.class));
                break;
            }
            case R.id.btnSci2:{
                startActivity(new Intent(Homework2.this, ScienceHw2.class));
                break;
            }
            case R.id.btnBack2:{
                startActivity(new Intent(Homework2.this, StudentLogin2.class));
                break;
            }
            default:{
                break;
            }
        }

    }
}