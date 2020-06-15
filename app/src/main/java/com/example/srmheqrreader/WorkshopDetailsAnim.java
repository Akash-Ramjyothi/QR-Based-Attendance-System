package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

import static maes.tech.intentanim.CustomIntent.customType;

public class WorkshopDetailsAnim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop_details_anim);

        new Timer().schedule(new TimerTask(){
            public void run() {
                WorkshopDetailsAnim.this.runOnUiThread(new Runnable() {
                    public void run() {
                        //startActivity(new Intent(MainActivity.this, SigninActivity.class));
                        Intent intent = new Intent(WorkshopDetailsAnim.this, WorkshopInfoActivity.class);
                        startActivity(intent);
                        customType(WorkshopDetailsAnim.this,"up-to-bottom");
                    }
                });
            }
        }, 2000);
    }
}
