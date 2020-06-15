package com.example.srmheqrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static maes.tech.intentanim.CustomIntent.customType;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button tosignup = (Button) findViewById(R.id.tosignup);
        Button to_forgot_password = (Button) findViewById(R.id.to_forgot_password);
        Button SignUpButton = (Button) findViewById(R.id.SignUpButton);

        tosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        to_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity.this, ForgotPasswordAnim.class);
                startActivity(intent);
                customType(SigninActivity.this,"right-to-left");
            }
        });

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SigninActivity.this, SignInSuccessActivity.class);
                startActivity(intent);
                customType(SigninActivity.this,"left-to-right");
            }
        });
    }
}