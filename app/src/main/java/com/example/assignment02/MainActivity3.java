package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button start,middle,End;
    TextView text;
    String letter=getIntent().getStringExtra("key");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text=findViewById(R.id.textView3);
        start=findViewById(R.id.Start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(letter.equals("ا") || letter.equals("ه")) {

                    text.setText("True");

                }
                else
                {
                    text.setText("False");
                }
            }
        });

        middle=findViewById(R.id.Middle);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(letter.equals("ع") || letter.equals("ح"))
                {
                    text.setText("True");
                }

                else
                {
                    text.setText("False");
                }
            }
        });

        End=findViewById(R.id.end);
        End.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(letter.equals("غ") || letter.equals("خ"))
                {
                    text.setText("True");
                }

                else
                {
                    text.setText("False");
                }


            }
        });





    }
}