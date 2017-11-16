package com.example.ali_j.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FirstFragment(View view){
        Log.e("debug","start");
        FragmentManager fragmentManager = getFragmentManager();
        Log.e("debug","1");
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Log.e("debug","2");
        FirstFragment first=new FirstFragment();
        Log.e("debug","3");
        fragmentTransaction.replace(R.id.fragment_frame, first);
        Log.e("debug","4");
        fragmentTransaction.commit();
        Log.e("debug","5");

    }

    public void SecondFragment(View view){
        Log.e("debug","start");
        FragmentManager fragmentManager = getFragmentManager();
        Log.e("debug","1");
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Log.e("debug","2");
        SecondFragment second=new SecondFragment();
        Log.e("debug","3");
        fragmentTransaction.replace(R.id.fragment_frame, second);
        Log.e("debug","4");
        fragmentTransaction.commit();
        Log.e("debug","5");

    }


}
