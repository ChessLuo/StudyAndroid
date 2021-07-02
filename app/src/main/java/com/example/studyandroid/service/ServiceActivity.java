package com.example.studyandroid.service;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyandroid.R;

public class ServiceActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        setTitle(ServiceActivity.class.getSimpleName());
        mTextView = findViewById(R.id.textView);
        String textStr = "Service 是一种可在后台执行长时间运行操作而不提供界面的应用组件。服务可由其他应用组件启动，而且即使用户切换到其他应用，" +
                "服务仍将在后台继续运行。此外，组件可通过绑定到服务与之进行交互，甚至是执行进程间通信 (IPC)。例如，服务可在后台处理网络事务、播放音乐，" +
                "执行文件 I/O 或与内容提供程序进行交互。";

        mTextView.setText(textStr);
    }

    public void bindService(View view) {

    }

    public void startService(View view) {

    }

}