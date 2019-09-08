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
public class PlaceAComplaintFragment extends Fragment {
    Button buttonsend;

    public PlaceAComplaintFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_place_acomplaint, container, false);
        buttonsend = v.findViewById(R.id.buttonsend);
        myComplaints();
        return v;
    }
    public void myComplaints(){
        buttonsend.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container, new ComplaintPlacedSuccessFragment(), null).commit();
                    }
                }
        );
    }
}
