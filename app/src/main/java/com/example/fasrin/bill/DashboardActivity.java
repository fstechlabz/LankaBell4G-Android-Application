package com.example.fasrin.roshan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        button = findViewById(R.id.buttonBill);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent billHomeActivity = new Intent(DashboardActivity.this, HomeActivity.class);
                        startActivity(billHomeActivity);
                    }
                }
        );
    }
}
