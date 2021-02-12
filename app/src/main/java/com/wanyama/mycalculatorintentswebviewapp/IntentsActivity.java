package com.wanyama.mycalculatorintentswebviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class IntentsActivity extends AppCompatActivity {
    Button mBtnSms, mBtnEmail, mBtnShare, mBtnCamera, mBtnDial, mBtnCall, mBtnStk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        mBtnSms = findViewById(R.id.btn_sms);
        mBtnEmail = findViewById(R.id.btn_email);
        mBtnShare = findViewById(R.id.btn_share);
        mBtnCamera = findViewById(R.id.btn_camera);
        mBtnDial = findViewById(R.id.btn_dial);
        mBtnCall = findViewById(R.id.btn_call);
        mBtnStk = findViewById(R.id.btn_stk);

        mBtnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:+254714000000");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, this is .......");
                startActivity(intent);
            }
        });

        mBtnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","abc@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APPLICATION");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir, this is with regards to your job posting on ...");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });

        mBtnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Hey, download this app from www.king.com.....!");
                startActivity(shareIntent);
            }
        });

        mBtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(takePictureIntent, 1);
            }
        });

        mBtnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+254700000000";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mBtnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+"+25471400000"));
                if (ContextCompat.checkSelfPermission(IntentsActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(IntentsActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else
                {
                    startActivity(intent);
                }
            }
        });

        mBtnStk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent simToolKitLaunchIntent = getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk");
                if(simToolKitLaunchIntent != null) {
                    startActivity(simToolKitLaunchIntent);
                }
            }
        });
    }
}
