package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    Button b1,b2,b3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        String letter=getIntent().getStringExtra("key");

        b1=findViewById(R.id.R71);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(letter.equals("ت") || letter.equals("د") || letter.equals("ط") )
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity7.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity7.this,MainActivity2.class);
                    startActivity(intent);
                }
            }
        });


        b2=findViewById(R.id.R72);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(letter.equals("ظ") || letter.equals("ذ") || letter.equals("ث") )
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity7.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity7.this,MainActivity2.class);
                    startActivity(intent);
                }


            }
        });


        b3=findViewById(R.id.R73);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(letter.equals("ص") || letter.equals("ز") || letter.equals("س") )
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity7.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity7.this,MainActivity2.class);
                    startActivity(intent);
                }



            }
        });

    }
}