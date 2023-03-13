package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudentLogin3 extends AppCompatActivity implements View.OnClickListener {

    private Button btnNotice3, btnHomeWork3, btnLinks3, btnLecture3, btnLogOut3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login3);

        btnNotice3 = findViewById(R.id.btnNotice3);
        btnHomeWork3 = findViewById(R.id.btnHomeWork3);
        btnLinks3 = findViewById(R.id.btnLinks3);
        btnLecture3 = findViewById(R.id.btnLecture3);
        btnLogOut3 = findViewById(R.id.btnLogOut3);

        btnNotice3.setOnClickListener(this);
        btnHomeWork3.setOnClickListener(this);
        btnLinks3.setOnClickListener(this);
        btnLecture3.setOnClickListener(this);
        btnLogOut3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNotice3:{
                startActivity(new Intent(StudentLogin3.this, Notice3.class));
                break;
            }
            case R.id.btnHomeWork3:{
                startActivity(new Intent(StudentLogin3.this, Homework3.class));
                break;
            }
            case R.id.btnLinks3:{
                startActivity(new Intent(StudentLogin3.this, ClassLinks3.class));
                break;
            }
            case R.id.btnLecture3:{
                startActivity(new Intent(StudentLogin3.this, RecordedLectures3.class));
                break;
            }
            case R.id.btnLogOut3:{
                startActivity(new Intent(StudentLogin3.this, ClassSelection.class));
                Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
                break;
            }
            default:{
                break;
            }
        }

    }
}