package com.lab.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.content.DialogInterface;

public class MainActivity3 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity9();
            }

        });
    }

    public void openActivity9(){

        Intent intent = new Intent(this, MainActivity4.class);
        EditText ttxt1,ttxt2,ttxt3;
        ttxt1 = findViewById(R.id.editTextTextEmailAddress);
        ttxt2 = findViewById(R.id.editTextPhone);
        ttxt3 = findViewById(R.id.editTextTextPersonName2);
        String tt1 = ttxt1.getText().toString();
        String tt2 = ttxt2.getText().toString();
        String tt3 = ttxt3.getText().toString();
        intent.putExtra("email",tt1);
        intent.putExtra("mobile",tt2);
        intent.putExtra("age",tt3);
        startActivity(intent);
    }
}