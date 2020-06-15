package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import static maes.tech.intentanim.CustomIntent.customType;

public class SignInSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_success);

        new Timer().schedule(new TimerTask(){
            public void run() {
                SignInSuccessActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        //startActivity(new Intent(MainActivity.this, SigninActivity.class));
                        Intent intent = new Intent(SignInSuccessActivity.this, DashboardActivity.class);
                        startActivity(intent);
                        customType(SignInSuccessActivity.this,"left-to-right");
                    }
                });
            }
        }, 3000);
    }
}
