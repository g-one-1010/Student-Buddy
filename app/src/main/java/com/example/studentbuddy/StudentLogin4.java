package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudentLogin4 extends AppCompatActivity implements View.OnClickListener {

    private Button btnNotice4, btnHomeWork4, btnLinks4, btnLecture4, btnLogOut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login4);

        btnNotice4 = findViewById(R.id.btnNotice4);
        btnHomeWork4 = findViewById(R.id.btnHomeWork4);
        btnLinks4 = findViewById(R.id.btnLinks4);
        btnLecture4 = findViewById(R.id.btnLecture4);
        btnLogOut4 = findViewById(R.id.btnLogOut4);

        btnNotice4.setOnClickListener(this);
        btnHomeWork4.setOnClickListener(this);
        btnLinks4.setOnClickListener(this);
        btnLecture4.setOnClickListener(this);
        btnLogOut4.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNotice4:{
                startActivity(new Intent(StudentLogin4.this, Notice4.class));
                break;
            }
            case R.id.btnHomeWork4:{
                startActivity(new Intent(StudentLogin4.this, Homework4.class));
                break;
            }
            case R.id.btnLinks4:{
                startActivity(new Intent(StudentLogin4.this, ClassLinks4.class));
                break;
            }
            case R.id.btnLecture4:{
                startActivity(new Intent(StudentLogin4.this, RecordedLectures4.class));
                break;
            }
            case R.id.btnLogOut4:{
                startActivity(new Intent(StudentLogin4.this, ClassSelection.class));
                Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
                break;
            }
            default:{
                break;
            }
        }

    }
}