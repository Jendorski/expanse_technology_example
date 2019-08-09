package com.expanse.test.project.expanseproject.utils;

import android.app.Application;
import android.content.Context;

public class Utils extends Application {

    private static Utils singletonInstance;

    public Utils() {
        singletonInstance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        singletonInstance = this;

    }

    public static Context getContexts() {
        return singletonInstance.getApplicationContext();
    }

}
