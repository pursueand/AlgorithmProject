package com.pursue.algorithmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import leakcanary.LeakCanary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("tag","git");

    }
}
