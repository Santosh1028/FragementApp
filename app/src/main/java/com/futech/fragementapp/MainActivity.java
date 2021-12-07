package com.futech.fragementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.futech.fragementapp.fragement.FragementOne;
import com.futech.fragementapp.fragement.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    Button btnFirst, secBtn;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst=findViewById(R.id.btnFirst);
        secBtn=findViewById(R.id.btnSec);

        linearLayout=findViewById(R.id.fragementlayout);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragementOne fragementOne=new FragementOne();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragementlayout, fragementOne);
                fragmentTransaction.commit();
            }
        });

        secBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTwo fragmentTwo=new FragmentTwo();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragementlayout, fragmentTwo);
                transaction.commit();
            }
        });


    }
}