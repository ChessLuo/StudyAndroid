package com.example.studyandroid.activity.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyandroid.R;
/**
 * @描述
 * Activity启动模式的使用方式:
 * 1、通过AndroidMenifest.xml文件为Activity指定启动模式，如设置启动模式为singleTask：
 * <activity android:name=".LaunchModeActivity"
 *           android:launchMode="singleTask" />
 *
 * 2、通过在Intent中设置标志位addFlags方法来为Activity指定启动模式，如设置标志位为singleTask：
 *  Intent intent = new Intent(this, StandardActivity.class);
 *  intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
 *  startActivity(intent);
 *
 * 注1：某些适用于清单文件的启动模式不可用作 Intent 标志，同样，
 * 某些可用作 Intent 标志的启动模式无法在清单文件中定义(如：清单文件形式无法直接为 Activity 设置为 Intent.FLAG_ACTIVITY_CLEAR_TOP标识，
 * 而Intent标识无法指定Activity为 singleInstance 模式)。
 *
 * 注2：如果同时给一个Activity使用了上述两种方法指定启动模式，那么使用 Intent 标识的优先级更高。
 *
 *
 *
 *
 *
 * @author chessluo
 * @data 2021/7/1
 */
public class LaunchModeActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);
        setTitle("LaunchModeActivity");
        mTextView = findViewById(R.id.textView);
        //获取当前activity

    }

    public void toStandardPage(View view) {
        startActivity(new Intent(this, StandardActivity.class));
    }

    public void toSingleTopPage(View view) {
        /**
         * 通过AndroidMenifest.xml文件为Activity指定启动模式
         */
//        startActivity(new Intent(this,SingleTopActivity.class));
        /**
         * 通过设置标志位方式启动
         */
        Intent intent = new Intent(this, SingleTopActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void toSingleTaskPage(View view) {
        /**
         * 通过AndroidMenifest.xml文件为Activity指定启动模式
         */
//        startActivity(new Intent(this,SingleTaskActivity.class));

        /**
         * 通过设置标志位方式启动
         */
        Intent intent = new Intent(this, SingleTaskActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void toSingleInstancePage(View view) {
        startActivity(new Intent(this,SingleInstanceActivity.class));
    }

}