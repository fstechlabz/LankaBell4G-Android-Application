package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.SignupActivity;
import com.example.fasrin.roshan.HomeActivity;
import com.example.fasrin.roshan.R;
import com.example.fasrin.roshan.ui.home.HomeFragment;

public class PaymentDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_dashboard);

        Button seemore;
        Button seemore2;
        Button backtomainhome;



        seemore = findViewById(R.id.button);
        seemore2 = findViewById(R.id.button2);
        backtomainhome = findViewById(R.id.backtomainhome);




        seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaymentDashboard.this, DuePayments.class);
                startActivity(intent);

            }
        });

        seemore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(PaymentDashboard.this, History.class);
                startActivity(intent2);

            }
        });

        backtomainhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent2 = new Intent(PaymentDashboard.this, HomeFragment.class);
              startActivity(intent2);

           }
        });
    }
}
