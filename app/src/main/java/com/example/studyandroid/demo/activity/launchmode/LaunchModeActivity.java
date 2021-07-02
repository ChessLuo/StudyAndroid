package com.example.studyandroid.demo.activity.launchmode;

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
        //
        String textStr = "standard标准模式：\n每次启动一个 Activity 都会重新创建一个新的实例，不管这个实例是否已经存在，此模式的 Activity 默认会进入启动它的 Activity 所属的任务栈中；\n\n" +
                "singleTop栈顶复用模式：\n如果新 Activity 已经位于任务栈的栈顶，那么此 Activity 不会被重新创建，同时会回调 onNewIntent 方法，如果新 Activity 实例已经存在但不在栈顶，那么 Activity 依然会被重新创建；\n\n" +
                "singleTask栈内复用模式：\n只要 Activity 在一个任务栈中存在，那么多次启动此 Activity 都不会重新创建实例，并回调 onNewIntent 方法，此模式启动 Activity，系统首先会寻找是否 Activity 存在想要的任务栈，如果不存在，就会重新创建一个任务栈，然后把创建好 Activity 的实例放到栈中，具有 clearTop 功能；\n\n" +
                "singleInstance单实例模式：\n这是一种加强的 singleTask 模式，具有此种模式的 Activity 只能单独地位于一个任务栈中，且此任务栈中只有唯一一个实例；";

        mTextView.setText(textStr);
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