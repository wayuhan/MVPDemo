package com.example.administrator.newmvp;

import android.app.Application;

import com.trust.modular.TrustRetrofit;

public class MainApplication extends Application{
    public static TrustRetrofit mAppRetrofit;
    public static RequestServices mRequstServices;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppRetrofit = TrustRetrofit.Companion.create(this, "http://47.93.247.70:5188/");
//        mAppRetrofit = TrustRetrofit.Companion.create(this, Url.BaseUrl);
        mRequstServices = mAppRetrofit.getmRetrofit(RequestServices.class);
    }
}
