package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText wt,htft,htin;
        Button btcalc;
        TextView resultOut;


        wt=findViewById(R.id.editWeight);
        htft = findViewById(R.id.editHtft);
        htin = findViewById(R.id.editIn);
        btcalc=findViewById(R.id.btnCalc);
        resultOut = findViewById(R.id.rsLt);

        btcalc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                int weight = Integer.parseInt(wt.getText().toString());
                int feet= Integer.parseInt(htft.getText().toString());
                int inches= Integer.parseInt(htin.getText().toString());

                int totalinch= 12*feet +inches;
                double totalcm= totalinch*2.53;

                double totlemtr= totalcm/100;
                double bmi= weight/(totlemtr*totlemtr);

                if(bmi>25) {
                    resultOut.setText("you are over weighted !!!");
                }
                else if(bmi<18) {
                    resultOut.setText("you are under weighted !!!");
                }
                else {
                    resultOut.setText("you are Normal :) ....");
                }

            }
        });
    }
}