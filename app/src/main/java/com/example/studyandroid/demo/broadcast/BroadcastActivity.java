package com.example.studyandroid.demo.broadcast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyandroid.R;

public class BroadcastActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        setTitle(BroadcastActivity.class.getSimpleName());
        mTextView = findViewById(R.id.textView);
        String textStr = "";
        mTextView.setText(textStr);
    }

    /**
     * 静态注册广播接收者
     *
     * @param view
     */
    public void staticReg(View view) {
    }

    /**
     * 动态注册广播接收者
     *
     * @param view
     */
    public void unStaticReg(View view) {
    }
}