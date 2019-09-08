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
public class MonthlyBillInvoiceFragment extends Fragment {
    Button buttonDownload;

    public MonthlyBillInvoiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_monthly_bill_invoice, container, false);
        buttonDownload = v.findViewById(R.id.buttonDownload);
        changeComplaints();
        return v;
    }
    public void changeComplaints() {
        buttonDownload.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container_sub, new MonthlyBillFragment(), null).commit();
                    }
                }
        );
    }
}
