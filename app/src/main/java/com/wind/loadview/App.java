package com.wind.loadview;

import android.app.Application;

import com.wind.dialogtiplib.util.AppUtils;


/**
 * @author xiaokun
 * @date 2017/12/5
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
