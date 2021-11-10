package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button b61,b62,b63;
    Intent intent6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        String letter=getIntent().getStringExtra("key");

        b61=findViewById(R.id.R61);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(letter.equals("ل"))
                {
                    globalV.gnum++;
                    intent6=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent6);
                }
                else
                {
                    intent6=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent6);
                }


            }
        });


        b62=findViewById(R.id.R62);
        b62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(letter.equals("ن"))
                {
                    intent6=new Intent(MainActivity6.this,MainActivity2.class);
                    globalV.gnum++;
                    startActivity(intent6);


                }

                else
                {
                    intent6=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent6);
                }

            }
        });



        b63=findViewById(R.id.R63);
        b63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(letter.equals("ر"))
                {
                    globalV.gnum++;
                    intent6=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent6);
                }

                else
                {
                    intent6=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent6);
                }


            }
        });





    }
}