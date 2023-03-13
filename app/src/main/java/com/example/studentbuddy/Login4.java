package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login4 extends AppCompatActivity {

    private EditText edtTxtName4, edtTxtRoll4, edtTxtPwd4;
    private Button btnLogin4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);

        btnLogin4 = findViewById(R.id.btnLogin4);
        edtTxtName4 = findViewById(R.id.edtTxtName4);
        edtTxtRoll4 = findViewById(R.id.edtTxtRoll4);
        edtTxtPwd4 = findViewById(R.id.edtTxtPwd4);

        btnLogin4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(edtTxtPwd4.getText().toString());
            }
        });
    }

    private void validate(String pwd){
        if(pwd.equals("555")){

            DbManager db = new DbManager(Login4.this);
            String res4 = db.addRecord("5th", edtTxtRoll4.getText().toString(), edtTxtName4.getText().toString());

            if(res4.equals("True")){
                startActivity(new Intent(Login4.this, StudentLogin4.class));
                Toast.makeText(Login4.this, "Attendance Recorded Succesfully!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Login4.this, res4, Toast.LENGTH_SHORT).show();
                edtTxtName4.setText("");
                edtTxtRoll4.setText("");
                edtTxtPwd4.setText("");
            }

        }
        else{
            Toast.makeText(Login4.this, "Incoreect Password! Please Try Again", Toast.LENGTH_SHORT).show();
            edtTxtName4.setText("");
            edtTxtRoll4.setText("");
            edtTxtPwd4.setText("");
        }
    }
}