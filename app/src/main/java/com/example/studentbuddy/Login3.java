package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login3 extends AppCompatActivity {

    private EditText edtTxtName3, edtTxtRoll3, edtTxtPwd3;
    private Button btnLogin3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        btnLogin3 = findViewById(R.id.btnLogin3);
        edtTxtName3 = findViewById(R.id.edtTxtName3);
        edtTxtRoll3 = findViewById(R.id.edtTxtRoll3);
        edtTxtPwd3 = findViewById(R.id.edtTxtPwd3);

        btnLogin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(edtTxtPwd3.getText().toString());
            }
        });
    }

    private void validate(String pwd){
        if(pwd.equals("444")){

            DbManager db = new DbManager(Login3.this);
            String res3 = db.addRecord("4th", edtTxtRoll3.getText().toString(), edtTxtName3.getText().toString());

            if(res3.equals("True")){
                startActivity(new Intent(Login3.this, StudentLogin3.class));
                Toast.makeText(Login3.this, "Attendance Recorded Succesfully!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Login3.this, res3, Toast.LENGTH_SHORT).show();
                edtTxtName3.setText("");
                edtTxtRoll3.setText("");
                edtTxtPwd3.setText("");
            }

        }
        else{
            Toast.makeText(Login3.this, "Incorrect Password! Please Try Again", Toast.LENGTH_SHORT).show();
            edtTxtName3.setText("");
            edtTxtRoll3.setText("");
            edtTxtPwd3.setText("");
        }
    }
}