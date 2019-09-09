package com.example.myapplication.ui.tools;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class BillDetailsFragment extends Fragment {

    private TabLayout tabLayoutSub;
    public static FragmentManager fm1;
    public Context c;

    public BillDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bill_details, container, false);
        c = v.getContext();
        tabLayoutSub = v.findViewById(R.id.tabLayout_sub);

        tabLayoutSub.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getText().equals("Monthly Bill")) {
                    HomeActivity.fm1.beginTransaction().replace(R.id.fragment_container_sub,new MonthlyBillFragment(),null).commit();
                } else if(tab.getText().equals("Bill History")) {
                    HomeActivity.fm1.beginTransaction().replace(R.id.fragment_container_sub,new BillHistoryFragment(),null).commit();
                } else if(tab.getText().equals("Detailed Bill")) {
                    HomeActivity.fm1.beginTransaction().replace(R.id.fragment_container_sub,new DetailedBillFragment(),null).commit();
                    //Toast.makeText(c,tab.getText(),Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
