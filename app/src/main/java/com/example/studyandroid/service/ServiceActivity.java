package com.example.studyandroid.service;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyandroid.R;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        setTitle(ServiceActivity.class.getSimpleName());

    }

    public void bindService(View view) {

    }

    public void startService(View view) {

    }

}