package com.example.studyandroid.demo.activity.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.ThreadUtils;
import com.example.studyandroid.App;
import com.example.studyandroid.R;

public class ActPageActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_page);
        setTitle(ActPageActivity.class.getSimpleName());
        App.setShowLifeCycleStr("ActPageActivity onCreate" + "\n");
        mTextView = findViewById(R.id.textView);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        App.setShowLifeCycleStr("ActPageActivity onRestart" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        App.setShowLifeCycleStr("ActPageActivity onStart" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.setShowLifeCycleStr("ActPageActivity onResume" + "\n");
        /**
         * 这里为了演示，所以延时1000毫秒
         */
        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
            @Override
            public void run() {
                mTextView.setText(App.getShowLifeCycleStr());
            }
        },1000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        App.setShowLifeCycleStr("ActPageActivity onPause" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        App.setShowLifeCycleStr("ActPageActivity onStop" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.setShowLifeCycleStr("ActPageActivity onDestroy" + "\n");
    }

    public void toActPage2(View view) {
        startActivity(new Intent(this,ActPage2Activity.class));
    }

    public void clearData(View view) {
        App.clearLifeCycleStr();
        mTextView.setText(App.getShowLifeCycleStr());
    }
}