package com.lab.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();

        String title = bundle.getString("User","Default");

        String name = intent.getStringExtra("t1");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("mobile");
        String age = intent.getStringExtra("age");
        TextView sn = findViewById(R.id.textView6);
        TextView em = findViewById(R.id.textView8);


        sn.setText(title);
        em.setText(email);
        TextView pw = findViewById(R.id.textView10);
        pw.setText(phone);
        TextView ag = findViewById(R.id.textView12);
        ag.setText(age);


    }
}