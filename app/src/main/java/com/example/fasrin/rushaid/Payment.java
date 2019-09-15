package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.roshan.R;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button pay;
        Button editAmount;
        Button paytohis;

        pay = findViewById(R.id.payButton);
        editAmount = findViewById(R.id.editAmount);
        paytohis = findViewById(R.id.backpaytohistory);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Payment.this, CardDetails.class);
                startActivity(intent4);

            }
        });

        editAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Payment.this, PaymentBox.class);
                startActivity(intent5);

            }
        });

        paytohis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpaytohis = new Intent(Payment.this, History.class);
                startActivity(intentpaytohis);

            }
        });
    }
}
