package com.example.admin.chufang;

import android.app.Application;
import android.content.Context;

/**
 * Created by admin on 2018/1/26.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
