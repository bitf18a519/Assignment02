package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button b15,b25;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        String letter=getIntent().getStringExtra("key");


        b15=findViewById(R.id.R51);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(letter.equals("ي") || letter.equals("ج") || letter.equals("ش"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent);
                }


            }
        });


        b25.findViewById(R.id.R52);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( letter.equals("ض"))
                {
                    globalV.gnum++;
                    intent=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent);
                }
                else
                {
                    intent=new Intent(MainActivity6.this,MainActivity2.class);
                    startActivity(intent);
                }

            }
        });
    }
}