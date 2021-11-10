package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    Button b61,b62;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        String letter=getIntent().getStringExtra("key");

        b61=findViewById(R.id.R61);
        b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });



    }
}