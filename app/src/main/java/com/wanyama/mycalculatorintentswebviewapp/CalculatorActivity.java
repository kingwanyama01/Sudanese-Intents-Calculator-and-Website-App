package com.wanyama.mycalculatorintentswebviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView mTvAnswer;
    EditText mEdtFnum, mEdtSnum;
    Button mBtnAdd, mBtnSubtract, mBtnDivide, mBtnMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mTvAnswer = findViewById(R.id.tv_answer);
        mEdtFnum = findViewById(R.id.edt_fnum);
        mEdtSnum = findViewById(R.id.edt_snum);
        mBtnAdd = findViewById(R.id.btn_add);
        mBtnSubtract = findViewById(R.id.btn_subtract);
        mBtnDivide = findViewById(R.id.btn_divide);
        mBtnMultiply = findViewById(R.id.btn_multiply);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strFnum, strSnum;
                Double first_number, second_number;
                strFnum = mEdtFnum.getText().toString().trim();
                strSnum = mEdtSnum.getText().toString().trim();

                if (strFnum.isEmpty()){
                    mEdtFnum.setError("Please fill this field");
                    mEdtFnum.requestFocus();
                }else if (strSnum.isEmpty()){
                    mEdtSnum.setError("Please fill this field");
                    mEdtSnum.requestFocus();
                }else {
                    //Convert the received string values to double
                    first_number = Double.parseDouble(strFnum);
                    second_number = Double.parseDouble(strSnum);

                    Double answer = first_number + second_number;
                    mTvAnswer.setText(String.valueOf(answer));
                }

            }
        });

        mBtnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFnum, strSnum;
                Double first_number, second_number;
                strFnum = mEdtFnum.getText().toString().trim();
                strSnum = mEdtSnum.getText().toString().trim();

                if (strFnum.isEmpty()){
                    mEdtFnum.setError("Please fill this field");
                    mEdtFnum.requestFocus();
                }else if (strSnum.isEmpty()){
                    mEdtSnum.setError("Please fill this field");
                    mEdtSnum.requestFocus();
                }else {
                    //Convert the received string values to double
                    first_number = Double.parseDouble(strFnum);
                    second_number = Double.parseDouble(strSnum);

                    Double answer = first_number - second_number;
                    mTvAnswer.setText(String.valueOf(answer));
                }
            }
        });

        mBtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFnum, strSnum;
                Double first_number, second_number;
                strFnum = mEdtFnum.getText().toString().trim();
                strSnum = mEdtSnum.getText().toString().trim();

                if (strFnum.isEmpty()){
                    mEdtFnum.setError("Please fill this field");
                    mEdtFnum.requestFocus();
                }else if (strSnum.isEmpty()){
                    mEdtSnum.setError("Please fill this field");
                    mEdtSnum.requestFocus();
                }else {
                    //Convert the received string values to double
                    first_number = Double.parseDouble(strFnum);
                    second_number = Double.parseDouble(strSnum);

                    Double answer = first_number / second_number;
                    mTvAnswer.setText(String.valueOf(answer));
                }
            }
        });

        mBtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFnum, strSnum;
                Double first_number, second_number;
                strFnum = mEdtFnum.getText().toString().trim();
                strSnum = mEdtSnum.getText().toString().trim();

                if (strFnum.isEmpty()){
                    mEdtFnum.setError("Please fill this field");
                    mEdtFnum.requestFocus();
                }else if (strSnum.isEmpty()){
                    mEdtSnum.setError("Please fill this field");
                    mEdtSnum.requestFocus();
                }else {
                    //Convert the received string values to double
                    first_number = Double.parseDouble(strFnum);
                    second_number = Double.parseDouble(strSnum);

                    Double answer = first_number * second_number;
                    mTvAnswer.setText(String.valueOf(answer));
                }
            }
        });
    }
}
