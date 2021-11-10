package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button b1,b2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        String letter=getIntent().getStringExtra("key");


        b1=findViewById(R.id.R51);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(letter.equals("ي") || letter.equals("ج") || letter.equals("ش"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity5.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity5.this,MainActivity2.class);
                    startActivity(intent);
                }


            }
        });


        b2.findViewById(R.id.R52);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( letter.equals("ض"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity5.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity5.this,MainActivity2.class);
                    startActivity(intent);
                }

            }
        });


    }
}