package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudentLogin2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnNotice2, btnHomeWork2, btnLinks2, btnLecture2, btnLogOut2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login2);

        btnNotice2 = findViewById(R.id.btnNotice2);
        btnHomeWork2 = findViewById(R.id.btnHomeWork2);
        btnLinks2 = findViewById(R.id.btnLinks2);
        btnLecture2 = findViewById(R.id.btnLecture2);
        btnLogOut2 = findViewById(R.id.btnLogOut2);

        btnNotice2.setOnClickListener(this);
        btnHomeWork2.setOnClickListener(this);
        btnLinks2.setOnClickListener(this);
        btnLecture2.setOnClickListener(this);
        btnLogOut2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNotice2:{
                startActivity(new Intent(StudentLogin2.this, Notice2.class));
                break;
            }
            case R.id.btnHomeWork2:{
                startActivity(new Intent(StudentLogin2.this, Homework2.class));
                break;
            }
            case R.id.btnLinks2:{
                startActivity(new Intent(StudentLogin2.this, ClassLinks2.class));
                break;
            }
            case R.id.btnLecture2:{
                startActivity(new Intent(StudentLogin2.this, RecordedLectures2.class));
                break;
            }
            case R.id.btnLogOut2:{
                startActivity(new Intent(StudentLogin2.this, ClassSelection.class));
                Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
                break;
            }
            default:{
                break;
            }
        }

    }
}