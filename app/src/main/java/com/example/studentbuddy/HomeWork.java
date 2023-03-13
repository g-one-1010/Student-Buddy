package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeWork extends AppCompatActivity implements View.OnClickListener {

    private Button btnEng, btnMath, btnSci, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);

        btnEng = findViewById(R.id.btnEng);
        btnMath = findViewById(R.id.btnMath);
        btnSci = findViewById(R.id.btnSci);
        btnBack = findViewById(R.id.btnBack);

        btnEng.setOnClickListener(this);
        btnMath.setOnClickListener(this);
        btnSci.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEng:{
                startActivity(new Intent(HomeWork.this, EnglishHw.class));
                break;
            }
            case R.id.btnMath:{
                startActivity(new Intent(HomeWork.this, MathHw.class));
                break;
            }
            case R.id.btnSci:{
                startActivity(new Intent(HomeWork.this, ScienceHw.class));
                break;
            }
            case R.id.btnBack:{
                startActivity(new Intent(HomeWork.this, StudentLogin.class));
                break;
            }
            default:{
                break;
            }
        }

    }
}