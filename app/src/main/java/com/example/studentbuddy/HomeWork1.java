package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeWork1 extends AppCompatActivity implements View.OnClickListener {

    private Button btnEng1, btnMath1, btnSci1, btnBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work1);

        btnEng1 = findViewById(R.id.btnEng1);
        btnMath1 = findViewById(R.id.btnMath1);
        btnSci1 = findViewById(R.id.btnSci1);
        btnBack1 = findViewById(R.id.btnBack1);

        btnEng1.setOnClickListener(this);
        btnMath1.setOnClickListener(this);
        btnSci1.setOnClickListener(this);
        btnBack1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEng1:{
                startActivity(new Intent(HomeWork1.this, EnglishHw1.class));
                break;
            }
            case R.id.btnMath1:{
                startActivity(new Intent(HomeWork1.this, MathHw1.class));
                break;
            }
            case R.id.btnSci1:{
                startActivity(new Intent(HomeWork1.this, ScienceHw1.class));
                break;
            }
            case R.id.btnBack1:{
                startActivity(new Intent(HomeWork1.this, StudentLogin1.class));
                break;
            }
            default:{
                break;
            }
        }

    }
}