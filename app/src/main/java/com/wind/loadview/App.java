package com.wind.loadview;

import android.app.Application;

import com.wind.dialogtiplib.util.AppUtils;


/**
 * @author lime
 * @date 2020/12/5
 */

public class App extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        AppUtils.init(this);
    }
}
