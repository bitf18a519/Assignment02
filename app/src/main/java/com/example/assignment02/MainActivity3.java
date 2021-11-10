package com.example.assignment02;

import static java.util.logging.Logger.global;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button start,middle,End;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);
        String letter=getIntent().getStringExtra("key");

        start=findViewById(R.id.Start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter.equals("غ") || letter.equals("خ")) {

                    globalV.gnum++;
                    intent=new Intent(MainActivity3.this,MainActivity2.class);
                    startActivity(intent);

                }
            }
        });

        middle=findViewById(R.id.Middle);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(letter.equals("ع") || letter.equals("ح"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity3.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });

        End=findViewById(R.id.end);
        End.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(letter.equals("ا") || letter.equals("ه"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity3.this,MainActivity2.class);
                    startActivity(intent);
                }


            }
        });





    }
}