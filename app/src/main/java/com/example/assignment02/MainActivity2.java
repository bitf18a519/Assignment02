package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView text;
    Button throat,tongue,mouth,lips,nose;
    Random num =new Random();
    String []Arabic={"ا","ب","ث","ج","ح","خ","ت","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","ف","ق","ل","م","ن","ك","ه","و","ي","غ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int number= num.nextInt(28);
        text=findViewById(R.id.textView);
        text.setText(Arabic[number]);

        throat=findViewById(R.id.thoat);
        throat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Arabic[number].equals("ا") || Arabic[number].equals("ه") || Arabic[number].equals("ع") || Arabic[number].equals("ح") || Arabic[number].equals("غ") || Arabic[number].equals("خ") )
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                    intent.putExtra("key",Arabic[number]);
                    startActivity(intent);

                }
            }
        });


    }
}