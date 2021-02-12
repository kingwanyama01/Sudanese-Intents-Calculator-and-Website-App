package com.wanyama.mycalculatorintentswebviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnCalc, mBtnWeb, mBtnIntents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnCalc = findViewById(R.id.btn_calc);
        mBtnWeb = findViewById(R.id.btn_web);
        mBtnIntents = findViewById(R.id.btn_intents);

        mBtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move1 = new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(move1);
            }
        });

        mBtnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move2 = new Intent(MainActivity.this,WebsiteActivity.class);
                startActivity(move2);
            }
        });

        mBtnIntents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move3 = new Intent(MainActivity.this,IntentsActivity.class);
                startActivity(move3);
            }
        });
    }
}
