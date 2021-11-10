package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView text;
    Random num =new Random();
    String []Arabic={"ا","ب","ث","ج","ح","خ","ت","د","ذ","ر","ز","س","ش","ص","ض","ط","ظ","ع","ف","ق","ل","م","ن","ك","ه","و","ي","غ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);






    }
}