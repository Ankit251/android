package com.lab.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Uname;
    private EditText pwd;
    private Button login;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uname = (EditText) findViewById(R.id.PT1);
        pwd = (EditText) findViewById(R.id.PT2);
        login = (Button) findViewById(R.id.BT1);
        msg = (TextView) findViewById(R.id.TV1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }
        private void validate() {
            if ((Uname.getText().toString().equals("Sharath"))&& (pwd.getText().toString().equals("12345")))
            {
                msg.setText("Login Successful");
            }
            else if ((Uname.getText().toString().equals("MSRIT"))&& (pwd.getText().toString().equals("msrit")))
            {
                msg.setText("Login Successful");
            }
            else
            {
                login.setEnabled(true);
                msg.setText("Login failed");
                msg.setTextSize(22);
            }
        }
    }