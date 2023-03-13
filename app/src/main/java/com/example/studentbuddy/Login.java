package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText edtTxtName, edtTxtRoll, edtTxtPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        edtTxtName = findViewById(R.id.edtTxtName);
        edtTxtRoll = findViewById(R.id.edtTxtRoll);
        edtTxtPwd = findViewById(R.id.edtTxtPwd);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(edtTxtPwd.getText().toString());

            }
        });
    }

    private void validate(String pwd){
        if(pwd.equals("111")){

            DbManager db = new DbManager(Login.this);
            String res = db.addRecord("1st", edtTxtRoll.getText().toString(), edtTxtName.getText().toString());

            if(res.equals("True")){
                startActivity(new Intent(Login.this, StudentLogin.class));
                Toast.makeText(Login.this, "Attendance Recorded Succesfully!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Login.this, res, Toast.LENGTH_SHORT).show();
                edtTxtName.setText("");
                edtTxtRoll.setText("");
                edtTxtPwd.setText("");
            }

        }
        else{
            Toast.makeText(Login.this, "Incorrect Password! Please Try Again", Toast.LENGTH_SHORT).show();
            edtTxtName.setText("");
            edtTxtRoll.setText("");
            edtTxtPwd.setText("");
        }
    }
}