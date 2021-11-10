package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button b1,b2;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String letter=getIntent().getStringExtra("key");


        b1=findViewById(R.id.a41);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter.equals("ق"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity4.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity4.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });


        b2=findViewById(R.id.a42);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter.equals("ک"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity4.this,MainActivity2.class);
                    startActivity(intent);
                }

                else
                {
                    intent=new Intent(MainActivity4.this,MainActivity2.class);
                    startActivity(intent);
                }

            }
        });


    }




}