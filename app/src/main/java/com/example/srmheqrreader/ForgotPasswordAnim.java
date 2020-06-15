package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import static maes.tech.intentanim.CustomIntent.customType;

public class ForgotPasswordAnim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_anim);

        new Timer().schedule(new TimerTask(){
            public void run() {
                ForgotPasswordAnim.this.runOnUiThread(new Runnable() {
                    public void run() {
                        //startActivity(new Intent(MainActivity.this, SigninActivity.class));
                        Intent intent = new Intent(ForgotPasswordAnim.this, ForgotPasswordActivity1.class);
                        startActivity(intent);
                        customType(ForgotPasswordAnim.this,"left-to-right");
                    }
                });
            }
        }, 2600);
    }
}
