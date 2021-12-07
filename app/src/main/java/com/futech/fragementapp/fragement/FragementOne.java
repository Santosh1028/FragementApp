package com.futech.fragementapp.fragement;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.futech.fragementapp.R;
import com.futech.fragementapp.SecondActivity;

public class FragementOne extends Fragment {

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragement_one, container, false);

        tv=view.findViewById(R.id.tvFirst);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), SecondActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}