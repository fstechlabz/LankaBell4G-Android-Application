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
public class ComplaintsFragment extends Fragment {
    Button button4,button3;

    public ComplaintsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_complaints, container, false);
        button4 = v.findViewById(R.id.buttonsend);
        button3 = v.findViewById(R.id.button3);
        changeComplaints();
        myComplaints();
        return v;
    }
    public void changeComplaints() {
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container, new PlaceAComplaintFragment(), null).commit();
                    }
                }
        );
    }

    public void myComplaints(){
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HomeActivity.fm.beginTransaction().replace(R.id.fragment_container, new ViewComplaintsFragment(), null).commit();
                    }
                }
        );
    }
}
