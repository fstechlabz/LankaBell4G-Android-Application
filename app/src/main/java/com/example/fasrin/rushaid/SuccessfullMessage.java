package com.example.fasrin.rushaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fasrin.roshan.R;

public class SuccessfullMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfull_message);

        Button backtohistory;


        backtohistory = findViewById(R.id.backtohistory);


        backtohistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(SuccessfullMessage.this, PaymentDashboard.class);
                startActivity(intent4);

            }
        });
    }
}
