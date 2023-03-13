package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClassSelection extends AppCompatActivity implements View.OnClickListener{

    private Button btnFirst, btnSecond, btnThird, btnFourth, btnFifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_selection);

        btnFirst = findViewById(R.id.btnFirst);
        btnSecond = findViewById(R.id.btnSecond);
        btnThird = findViewById(R.id.btnThird);
        btnFourth = findViewById(R.id.btnFourth);
        btnFifth = findViewById(R.id.btnFifth);

        btnFirst.setOnClickListener(this);
        btnSecond.setOnClickListener(this);
        btnThird.setOnClickListener(this);
        btnFourth.setOnClickListener(this);
        btnFifth.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFirst:{
                startActivity(new Intent(this, Login.class));
                break;
            }
            case R.id.btnSecond:{
                startActivity(new Intent(this, Login1.class));
                break;
            }
            case R.id.btnThird:{
                startActivity(new Intent(this, Login2.class));
                break;
            }
            case R.id.btnFourth:{
                startActivity(new Intent(this, Login3.class));
                break;
            }
            case R.id.btnFifth:{
                startActivity(new Intent(this, Login4.class));
                break;
            }
            default:{
                break;
            }
        }

    }
}