package com.araujo.douglas.firebaseinvrivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    FirebaseAnalytics mFirebasAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic("mob");

        mFirebasAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void forcarCrash(View view) {
        int result = 2 / 0;
    }

    public void clickMe(View view) {
        Bundle params = new Bundle();
        params.putString("NOME", "Douglas");
        mFirebasAnalytics.logEvent("clickMe", params);
    }
}
