package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StudentLogin extends AppCompatActivity implements View.OnClickListener {

    private Button btnNotice, btnHomeWork, btnLinks, btnLecture, btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        btnNotice = findViewById(R.id.btnNotice);
        btnHomeWork = findViewById(R.id.btnHomeWork);
        btnLinks = findViewById(R.id.btnLinks);
        btnLecture = findViewById(R.id.btnLecture);
        btnLogOut = findViewById(R.id.btnLogOut);

        btnNotice.setOnClickListener(this);
        btnHomeWork.setOnClickListener(this);
        btnLinks.setOnClickListener(this);
        btnLecture.setOnClickListener(this);
        btnLogOut.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnNotice:{
                startActivity(new Intent(StudentLogin.this, Notice.class));
                break;
            }
            case R.id.btnHomeWork:{
                startActivity(new Intent(StudentLogin.this, HomeWork.class));
                break;
            }
            case R.id.btnLinks:{
                startActivity(new Intent(StudentLogin.this, ClassLinks.class));
                break;
            }
            case R.id.btnLecture:{
                startActivity(new Intent(StudentLogin.this, RecordedLectures.class));
                break;
            }
            case R.id.btnLogOut:{
                startActivity(new Intent(StudentLogin.this, ClassSelection.class));
                Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
                break;
            }
            default:{
                break;
            }
        }

    }
}