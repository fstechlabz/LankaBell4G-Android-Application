package com.example.fasrin.roshan;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.ui.tools.BillHistoryFragment;
import com.example.myapplication.ui.tools.HomeActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class BillHistoryInvoiceFragment extends Fragment {
    Button buttonDownload;

    public BillHistoryInvoiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bill_history_invoice, container, false);
        buttonDownload = v.findViewById(R.id.buttonDownload);
        changeComplaints();
        return v;
    }

    public void changeComplaints() {
        buttonDownload.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container_sub, new BillHistoryFragment(), null).commit();
                    }
                }
        );
    }

}
