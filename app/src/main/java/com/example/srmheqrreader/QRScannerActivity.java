package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static maes.tech.intentanim.CustomIntent.customType;

public class QRScannerActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    ZXingScannerView ScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView = new ZXingScannerView(this);
        //setContentView(R.layout.activity_qrscanner);
        setContentView(ScannerView);


    }

    @Override
    public void handleResult(Result result) {
        //
        Intent intent = new Intent(QRScannerActivity.this, QRInfoActivity.class);
        startActivity(intent);
        customType(QRScannerActivity.this,"bottom-to-up");
    }

    @Override
    protected void onPause() {
        super.onPause();

        ScannerView.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();

        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }

}
