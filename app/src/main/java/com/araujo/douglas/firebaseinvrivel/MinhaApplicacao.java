package com.araujo.douglas.firebaseinvrivel;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by logonrm on 05/08/2017.
 */

public class MinhaApplicacao extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}
