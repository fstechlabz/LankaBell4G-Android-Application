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
public class DetailedBillInvoiceFragment extends Fragment {
    Button buttonDownload;

    public DetailedBillInvoiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_detailed_bill_invoice, container, false);
        buttonDownload = v.findViewById(R.id.buttonDownload);
        changeComplaints();
        return v;
    }

    public void changeComplaints() {
        buttonDownload.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container_sub, new DetailedBillFragment(), null).commit();
                    }
                }
        );
    }
}