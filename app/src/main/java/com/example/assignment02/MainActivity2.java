package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView text,result;
    Button throat,tongu,mouth,lips,nose,nit,b6;
    Random num =new Random();
    String []Arabic={"ا","ب","ث","ج","ح","خ","ت","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","ف","ق","ل","م","ن","ک","ه","و","ي","غ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int number= num.nextInt(28);
        text=findViewById(R.id.textView);
        text.setText(Arabic[number]);

        String num= String.valueOf(globalV.gnum);
        result=findViewById(R.id.Result);
        result.setText(num);

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
                else
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });


        tongu=findViewById(R.id.tongue);
        tongu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Arabic[number].equals("ق") || Arabic[number].equals("ک")  )
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
                    intent.putExtra("key",Arabic[number]);
                    startActivity(intent);

                }

                else
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });


        lips=findViewById(R.id.lip);
        lips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Arabic[number].equals(Arabic[26]) || Arabic[number].equals(Arabic[3]) || Arabic[number].equals(Arabic[12]) || Arabic[number].equals(Arabic[14])  )
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity6.class);
                    intent.putExtra("key",Arabic[number]);
                    startActivity(intent);

                }

                else
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }


            }
        });


        mouth=findViewById(R.id.nose);
        mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Arabic[number].equals("ل") || Arabic[number].equals("ن") || Arabic[number].equals("ر")  )
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity6.class);
                    intent.putExtra("key",Arabic[number]);
                    startActivity(intent);

                }

                else
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }


            }
        });


        nose=findViewById(R.id.Nit);
        nose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Arabic[number].equals("ت") || Arabic[number].equals("د") || Arabic[number].equals("ط")  )
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity7.class);
                    intent.putExtra("key",Arabic[number]);
                    startActivity(intent);

                }

                else
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        });


        nit=findViewById(R.id.mouth);
        nit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Arabic[number].equals("ظ") || Arabic[number].equals("ذ") || Arabic[number].equals("ث") || Arabic[number].equals("ص") || Arabic[number].equals("ز") || Arabic[number].equals("س")  )
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity7.class);
                    intent.putExtra("key",Arabic[number]);
                    startActivity(intent);

                }

                else
                {
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(intent);
                }


            }

        });





    }
}