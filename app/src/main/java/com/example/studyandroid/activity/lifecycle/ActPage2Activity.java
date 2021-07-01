package com.example.studyandroid.activity.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.ThreadUtils;
import com.example.studyandroid.App;
import com.example.studyandroid.R;

public class ActPage2Activity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_page2);
        setTitle("ActPage2Activity");
        App.setShowLifeCycleStr("ActPage2Activity onCreate" + "\n");
        mTextView = findViewById(R.id.textView);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        App.setShowLifeCycleStr("ActPage2Activity onRestart" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        App.setShowLifeCycleStr("ActPage2Activity onStart" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.setShowLifeCycleStr("ActPage2Activity onResume" + "\n");
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
        App.setShowLifeCycleStr("ActPage2Activity onPause" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        App.setShowLifeCycleStr("ActPage2Activity onStop" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.setShowLifeCycleStr("ActPage2Activity onDestroy" + "\n");
    }

    public void toActPage(View view) {
        finish();
    }
}