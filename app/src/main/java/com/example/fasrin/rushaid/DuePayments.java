package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.roshan.R;

public class DuePayments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_due_payments);

        Button mypayments;
        Button duetohome;


        mypayments = findViewById(R.id.mypayments);
        duetohome = findViewById(R.id.backduetohome);


        mypayments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmypayments = new Intent(DuePayments.this, History.class);
                startActivity(intentmypayments);

            }
        });
        duetohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentduetohome = new Intent(DuePayments.this, PaymentDashboard.class);
                startActivity(intentduetohome);

            }
        });
    }
}
