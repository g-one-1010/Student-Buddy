package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudentLogin1 extends AppCompatActivity implements View.OnClickListener {

    private Button btnNotice1, btnHomeWork1, btnLinks1, btnLecture1, btnLogOut1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login1);

        btnNotice1 = findViewById(R.id.btnNotice1);
        btnHomeWork1 = findViewById(R.id.btnHomeWork1);
        btnLinks1 = findViewById(R.id.btnLinks1);
        btnLecture1 = findViewById(R.id.btnLecture1);
        btnLogOut1 = findViewById(R.id.btnLogOut1);

        btnNotice1.setOnClickListener(this);
        btnHomeWork1.setOnClickListener(this);
        btnLinks1.setOnClickListener(this);
        btnLecture1.setOnClickListener(this);
        btnLogOut1.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNotice1:{
                startActivity(new Intent(StudentLogin1.this, Notice1.class));
                break;
            }
            case R.id.btnHomeWork1:{
                startActivity(new Intent(StudentLogin1.this, HomeWork1.class));
                break;
            }
            case R.id.btnLinks1:{
                startActivity(new Intent(StudentLogin1.this, ClassLinks1.class));
                break;
            }
            case R.id.btnLecture1:{
                startActivity(new Intent(StudentLogin1.this, RecordedLectures1.class));
                break;
            }
            case R.id.btnLogOut1:{
                startActivity(new Intent(StudentLogin1.this, ClassSelection.class));
                Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
                break;
            }
            default:{
                break;
            }
        }

    }
}