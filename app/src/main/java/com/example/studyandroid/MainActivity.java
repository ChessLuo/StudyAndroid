package com.example.studyandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyandroid.activity.launchmode.LaunchModeActivity;
import com.example.studyandroid.activity.lifecycle.ActPageActivity;

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

    public void launchModePage(View view) {
        startActivity(new Intent(this, LaunchModeActivity.class));
    }
}