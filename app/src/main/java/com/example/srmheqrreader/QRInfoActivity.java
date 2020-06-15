package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class QRInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrinfo);

        Button QRcontent = (Button) findViewById(R.id.QRcontent);

        QRcontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QRInfoActivity.this, MarkPresentActivity.class);
                startActivity(intent);
                customType(QRInfoActivity.this,"right-to-left");
            }
        });
    }
}
