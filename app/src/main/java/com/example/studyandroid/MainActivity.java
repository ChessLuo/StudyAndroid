package com.example.studyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.studyandroid.activity.ActPageActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void actPage(View view) {
        App.clearLifeCycleStr();
        startActivity(new Intent(this, ActPageActivity.class));
    }
}