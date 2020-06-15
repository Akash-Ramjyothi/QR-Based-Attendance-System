package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class ForgotPasswordActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password1);

        Button ForgotPasswordSubmitButton = (Button) findViewById(R.id.ForgotPasswordSubmitButton);

        ForgotPasswordSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPasswordActivity1.this, PasswordResetSuccessActivity.class);
                startActivity(intent);
                customType(ForgotPasswordActivity1.this,"up-to-bottom");
            }
        });
    }
}
