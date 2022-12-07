package com.example.pr22germanmamontov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.pr22germanmamontov.Frragments.FirstFragment;
import com.example.pr22germanmamontov.Frragments.FourthFragment;
import com.example.pr22germanmamontov.Frragments.SecondFragment;
import com.example.pr22germanmamontov.Frragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {
 Button btfr1;
    Button btfr2;
    Button btfr3;
    Button btfr4;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btfr1= (Button) findViewById(R.id.btfr1);
        btfr2= (Button) findViewById(R.id.btfr2);
        btfr3= (Button) findViewById(R.id.btfr3);
        btfr4 =(Button) findViewById(R.id.btfr4);
        linearLayout=(LinearLayout) findViewById(R.id.ll2);
        btfr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll2,firstFragment);
                transaction.commit();
            }
        });
        btfr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll2,secondFragment);
                transaction.commit();
            }
        });
        btfr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdFragment thirdFragment = new ThirdFragment();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll2,thirdFragment);
                transaction.commit();
            }
        });
        btfr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FourthFragment fourthFragment = new FourthFragment();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.ll2,fourthFragment);
                transaction.commit();
            }
        });
    }
}