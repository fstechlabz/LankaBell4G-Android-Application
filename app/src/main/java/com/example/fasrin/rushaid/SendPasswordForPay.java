package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.roshan.R;

public class SendPasswordForPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_password_for_pay);

        Button sendpassword;

        sendpassword = findViewById(R.id.payButton);

        sendpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(SendPasswordForPay.this, PasswordEnter.class);
                startActivity(intent4);

            }
        });
    }
}
