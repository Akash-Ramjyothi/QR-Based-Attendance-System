package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import static maes.tech.intentanim.CustomIntent.customType;

public class SignupSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_success);

        new Timer().schedule(new TimerTask(){
            public void run() {
                SignupSuccessActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        //startActivity(new Intent(MainActivity.this, SigninActivity.class));
                        Intent intent = new Intent(SignupSuccessActivity.this, SigninActivity.class);
                        startActivity(intent);
                    }
                });
            }
        }, 2600);
    }
}
