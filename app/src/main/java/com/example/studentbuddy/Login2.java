package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login2 extends AppCompatActivity {

    private EditText edtTxtName2, edtTxtRoll2, edtTxtPwd2;
    private Button btnLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        btnLogin2 = findViewById(R.id.btnLogin2);
        edtTxtName2 = findViewById(R.id.edtTxtName2);
        edtTxtRoll2 = findViewById(R.id.edtTxtRoll2);
        edtTxtPwd2 = findViewById(R.id.edtTxtPwd2);

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(edtTxtPwd2.getText().toString());
            }
        });
    }
    private void validate(String pwd){
        if(pwd.equals("333")){

            DbManager db = new DbManager(Login2.this);
            String res2 = db.addRecord("3rd", edtTxtRoll2.getText().toString(), edtTxtName2.getText().toString());

            if(res2.equals("True")){
                startActivity(new Intent(Login2.this, StudentLogin2.class));
                Toast.makeText(Login2.this, "Attendance Recorded Succesfully!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Login2.this, res2, Toast.LENGTH_SHORT).show();
                edtTxtName2.setText("");
                edtTxtRoll2.setText("");
                edtTxtPwd2.setText("");
            }

        }
        else{
            Toast.makeText(Login2.this, "Incorrect Password! Please Try Again", Toast.LENGTH_SHORT).show();
            edtTxtName2.setText("");
            edtTxtRoll2.setText("");
            edtTxtPwd2.setText("");
        }
    }
}