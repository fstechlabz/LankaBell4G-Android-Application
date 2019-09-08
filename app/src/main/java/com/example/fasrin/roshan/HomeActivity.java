package com.example.fasrin.roshan;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    public static FragmentManager fm,fm1;
    private TabItem paymentTab,billDetailsTab;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        paymentTab = findViewById(R.id.paymentTab);
        billDetailsTab = findViewById(R.id.billDetailsTab);
        tabLayout = findViewById(R.id.tabLayout);



        fm =getSupportFragmentManager();
        fm1 = getSupportFragmentManager();

        if(findViewById(R.id.fragment_container) != null) {
            if(savedInstanceState!= null) {
                return;
            }

            FragmentTransaction ft = fm.beginTransaction();
            BillDetailsFragment bdf = new BillDetailsFragment();
            ft.add(R.id.fragment_container, bdf,null);
            ft.commit();
        }

        if(findViewById(R.id.fragment_container_sub)!= null) {
            if(savedInstanceState!= null) {
                return;
            }

            FragmentTransaction ft1 = fm1.beginTransaction();
            MonthlyBillFragment mbf = new MonthlyBillFragment();
            ft1.add(R.id.fragment_container_sub, mbf,null);
            ft1.commit();
        }

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getText().equals("Bill Details")) {
                    HomeActivity.fm.beginTransaction().replace(R.id.fragment_container,new BillDetailsFragment(),null).commit();
                } else if(tab.getText().equals("Payment Details")) {
                    HomeActivity.fm.beginTransaction().replace(R.id.fragment_container,new PaymentFragment(),null).commit();
                } else if(tab.getText().equals("Complaints")) {
                    HomeActivity.fm.beginTransaction().replace(R.id.fragment_container,new ComplaintsFragment(),null).commit();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


}
