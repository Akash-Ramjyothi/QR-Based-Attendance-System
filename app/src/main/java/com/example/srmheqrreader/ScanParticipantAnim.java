package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import static maes.tech.intentanim.CustomIntent.customType;

public class ScanParticipantAnim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_participant_anim);

        new Timer().schedule(new TimerTask(){
            public void run() {
                ScanParticipantAnim.this.runOnUiThread(new Runnable() {
                    public void run() {
                        //startActivity(new Intent(MainActivity.this, SigninActivity.class));
                        Intent intent = new Intent(ScanParticipantAnim.this, ScanParticipantInfoActivity.class);
                        startActivity(intent);
                        customType(ScanParticipantAnim.this,"left-to-right");
                    }
                });
            }
        }, 1500);
    }
}
