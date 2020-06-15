package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import static maes.tech.intentanim.CustomIntent.customType;

public class MarkPresentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_present);

        new Timer().schedule(new TimerTask(){
            public void run() {
                MarkPresentActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        //startActivity(new Intent(MainActivity.this, SigninActivity.class));
                        Intent intent = new Intent(MarkPresentActivity.this, DashboardActivity.class);
                        startActivity(intent);
                        customType(MarkPresentActivity.this,"left-to-right");
                    }
                });
            }
        }, 1500);
    }
}
