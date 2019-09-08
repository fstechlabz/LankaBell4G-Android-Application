package com.example.fasrin.roshan;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComplaintPlacedSuccessFragment extends Fragment {
    ImageView imageView;
    Button buttonMyComplaints;

    public ComplaintPlacedSuccessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_complaint_placed_success, container, false);

        imageView = v.findViewById(R.id.imageView12);
        buttonMyComplaints = v.findViewById(R.id.buttonMyComplaints);
        myComplaints();
        close();
        return v;
    }
    public void myComplaints(){
        buttonMyComplaints.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container, new ViewComplaintsFragment(), null).commit();
                    }
                }
        );
    }
    public void close(){
        imageView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container, new ComplaintsFragment(), null).commit();
                    }
                }
        );
    }
}
