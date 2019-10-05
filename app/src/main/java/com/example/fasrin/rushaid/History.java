package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.roshan.R;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Button gotopay;
        Button backtohome;

        gotopay = findViewById(R.id.gotopaybutton);
        backtohome = findViewById(R.id.backtohome);

        gotopay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this, Payment.class);
                startActivity(intent);

            }
        });

        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbacktohome = new Intent(History.this, PaymentDashboard.class);
                startActivity(intentbacktohome);

            }
        });
    }
}
