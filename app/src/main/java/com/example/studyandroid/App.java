package com.example.studyandroid;

import android.app.Application;
import android.text.TextUtils;

public class App extends Application {

    private static Application instance;
    private static String showLifeCycleStr = "";

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Application getInstance() {
        return instance;
    }

    /**
     * 保存两个activity跳转后的生命周期记录
     * @return
     */
    public static String getShowLifeCycleStr() {
        return showLifeCycleStr;
    }

    public static void setShowLifeCycleStr(String showLifeCycleStr) {
        App.showLifeCycleStr = App.showLifeCycleStr+showLifeCycleStr;
    }

    public static void clearLifeCycleStr() {
        App.showLifeCycleStr = "";
    }
}
