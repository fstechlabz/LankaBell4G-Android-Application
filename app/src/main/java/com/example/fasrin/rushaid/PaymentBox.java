package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.roshan.R;

public class PaymentBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_box);

        Button editOk;
        Button backtopayview;

        editOk = findViewById(R.id.editOkbutton);
        backtopayview = findViewById(R.id.backtopayviewfromedit);


        editOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenteditok = new Intent(PaymentBox.this, Payment.class);
                startActivity(intenteditok);

            }
        });

        backtopayview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbacktopay = new Intent(PaymentBox.this, Payment.class);
                startActivity(intentbacktopay);

            }
        });


    }
}
