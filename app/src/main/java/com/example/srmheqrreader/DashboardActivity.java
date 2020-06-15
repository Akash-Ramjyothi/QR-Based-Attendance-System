package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button workshop_details_button = (Button) findViewById(R.id.workshop_details_button);
        Button view_participants_button = (Button) findViewById(R.id.view_participants_button);
        Button scan_participants_button = (Button) findViewById(R.id.scan_participants_button);

        workshop_details_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, WorkshopCodeActivity.class);
                startActivity(intent);
                customType(DashboardActivity.this,"bottom-to-up");
            }
        });

        view_participants_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, ScanParticipantCodeActivity.class);
                startActivity(intent);
                customType(DashboardActivity.this,"left-to-right");
            }
        });

        scan_participants_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, QRScannerActivity.class);
                startActivity(intent);
                customType(DashboardActivity.this,"up-to-bottom");
            }
        });
    }
}
