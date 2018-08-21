package com.example.arouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();//打印日志
        ARouter.openDebug();//开启debug
        ARouter.init(this);
    }
}
