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



public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity2();
            }

        });
    }

    public void openActivity2(){

        Intent intent = new Intent(this, MainActivity2.class);
        Intent intent2 = new Intent(this,MainActivity4.class);
        EditText txt1,txt2;
        txt1 = findViewById(R.id.editTextTextPersonName);
        txt2 = findViewById(R.id.editTextTextPassword);
        String t1 = txt1.getText().toString();
        String t2 = txt2.getText().toString();
        intent.putExtra("nm1",t1);
        intent.putExtra("pw1",t2);



        Bundle bundle = new Bundle();
        bundle.putString("User",t1);
        intent.putExtras(bundle);
        intent2.putExtras(bundle);


        if(t1.equals("ankit") && t2.equals("kumar")){

            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
        }

    }

    
}