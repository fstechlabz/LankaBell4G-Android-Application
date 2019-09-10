package com.example.fasrin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fasrin.roshan.MenuActivity;
import com.example.fasrin.roshan.R;

public class MainActivity extends AppCompatActivity {
    TextView singup;
    TextView  forgotPassword;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        singup = findViewById(R.id.textView4);
        forgotPassword = findViewById(R.id.textView3);
        login = findViewById(R.id.button);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singinActivity = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(singinActivity);
            }
        });


        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ForgotpassActivity = new Intent(MainActivity.this, ForgotPasswordActivity.class);
                startActivity(ForgotpassActivity);
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginActivity = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(LoginActivity);
            }
        });

    }

}
