package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button quizt,learnt,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quizt=findViewById(R.id.quiz);

        quizt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

            }
        });


        b6=findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,MainActivity8.class);
                startActivity(intent);

            }
        });
        learnt=findViewById(R.id.learn);
        learnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent viewIntent = new Intent("android.intent.action.VIEW",
                        Uri.parse("https://drive.google.com/file/d/1vtD6Ojkxrk3HORySHSl06OwXIo5JmRB0/view?usp=sharing"));
                startActivity(viewIntent);

            }
        });


    }





}