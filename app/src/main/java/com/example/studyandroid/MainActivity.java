package com.example.studyandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyandroid.demo.Javabasis.JavaBasisActivity;
import com.example.studyandroid.demo.activity.launchmode.LaunchModeActivity;
import com.example.studyandroid.demo.activity.lifecycle.ActPageActivity;
import com.example.studyandroid.demo.animation.AnimationActivity;
import com.example.studyandroid.demo.broadcast.BroadcastActivity;
import com.example.studyandroid.demo.codeanalysis.CodeAnalysisActivity;
import com.example.studyandroid.demo.contentprovider.CtProviderActivity;
import com.example.studyandroid.demo.customview.CustomViewActivity;
import com.example.studyandroid.demo.fragment.FragmentActivity;
import com.example.studyandroid.demo.service.ServiceActivity;
import com.example.studyandroid.demo.thread.ThreadActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void javaBasisPage(View view) {
        startActivity(new Intent(this, JavaBasisActivity.class));
    }

    public void actPage(View view) {
        App.clearLifeCycleStr();
        startActivity(new Intent(this, ActPageActivity.class));
    }

    public void launchModePage(View view) {
        startActivity(new Intent(this, LaunchModeActivity.class));
    }

    public void servicePage(View view) {
        startActivity(new Intent(this, ServiceActivity.class));
    }

    public void broadcastPage(View view) {
        startActivity(new Intent(this, BroadcastActivity.class));
    }

    public void contentProviderPage(View view) {
        startActivity(new Intent(this, CtProviderActivity.class));
    }

    public void fragmentPage(View view) {
        startActivity(new Intent(this, FragmentActivity.class));
    }

    public void threadPage(View view) {
        startActivity(new Intent(this, ThreadActivity.class));
    }

    public void animationPage(View view) {
        startActivity(new Intent(this, AnimationActivity.class));
    }

    public void customViewPage(View view) {
        startActivity(new Intent(this, CustomViewActivity.class));
    }

    public void codeAnalysisPage(View view) {
        startActivity(new Intent(this, CodeAnalysisActivity.class));
    }

}