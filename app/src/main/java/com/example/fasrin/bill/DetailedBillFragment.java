package com.example.fasrin.roshan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailedBillFragment extends Fragment {
    Button buttonBillHistory;

    public DetailedBillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_detailed_bill, container, false);
        buttonBillHistory = v.findViewById(R.id.buttonBillHistory);
        changeComplaints();
        return v;
    }

    public void changeComplaints() {
        buttonBillHistory.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container_sub, new DetailedBillInvoiceFragment(), null).commit();
                    }
                }
        );
    }
}
