package com.example.myapplication.ui.tools;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MonthlyBillFragment extends Fragment {
    Button buttonBillHistory;

    public MonthlyBillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_monthly_bill, container, false);
        buttonBillHistory = v.findViewById(R.id.buttonBillHistory);
        changeComplaints();
        return v;
    }

    public void changeComplaints() {
        buttonBillHistory.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container_sub, new MonthlyBillInvoiceFragment(), null).commit();
                    }
                }
        );
    }
}
