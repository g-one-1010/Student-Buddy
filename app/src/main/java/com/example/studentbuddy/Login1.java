package com.example.studentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login1 extends AppCompatActivity {

    private EditText edtTxtName1, edtTxtRoll1, edtTxtPwd1;
    private Button btnLogin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        btnLogin1 = findViewById(R.id.btnLogin1);
        edtTxtName1 = findViewById(R.id.edtTxtName1);
        edtTxtRoll1 = findViewById(R.id.edtTxtRoll1);
        edtTxtPwd1 = findViewById(R.id.edtTxtPwd1);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate(edtTxtPwd1.getText().toString());
            }
        });
    }

    private void validate(String pwd){
        if(pwd.equals("222")){

            DbManager db = new DbManager(Login1.this);
            String res1 = db.addRecord("2nd", edtTxtRoll1.getText().toString(), edtTxtName1.getText().toString());

            if(res1.equals("True")){
                startActivity(new Intent(Login1.this, StudentLogin1.class));
                Toast.makeText(Login1.this, "Attendance Recorded Succesfully!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(Login1.this, res1, Toast.LENGTH_SHORT).show();
                edtTxtName1.setText("");
                edtTxtRoll1.setText("");
                edtTxtPwd1.setText("");
            }

        }
        else{
            Toast.makeText(Login1.this, "Incorrect Password! Please Try Again", Toast.LENGTH_SHORT).show();
            edtTxtName1.setText("");
            edtTxtRoll1.setText("");
            edtTxtPwd1.setText("");
        }
    }
}