package com.nwei.shen.activities;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by admin on 2018/2/27.
 */

public class MyApplication extends Application{
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
