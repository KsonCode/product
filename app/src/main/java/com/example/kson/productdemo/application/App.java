package com.example.kson.productdemo.application;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    public static Context context;

    /**
     * 主要是初始化本应用的资源或者第三方平台的资源
     */
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        initImageloader();
        initPush();
        initMap();
    }


    private void initMap() {

    }

    private void initPush() {

    }

    private void initImageloader() {

    }
}
