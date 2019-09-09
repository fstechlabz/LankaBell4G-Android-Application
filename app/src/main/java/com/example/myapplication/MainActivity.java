package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView singup;
    TextView  forgotPassword;
    Button login;
   // button

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
                Intent singinActivity = new Intent(MainActivity.this, signIn.class);
                startActivity(singinActivity);
            }
        });


        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ForgotpassActivity = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(ForgotpassActivity);
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginActivity = new Intent(MainActivity.this, DashBoard.class);
                startActivity(LoginActivity);
            }
        });

    }
}
