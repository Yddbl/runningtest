package com.goertek.runningtest.main

import android.app.Application
import android.content.Context
import android.util.Log

class App : Application() {

    private val TAG = "App";

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"onCreate");
        context = this;
    }

    companion object {
        lateinit var context: Context;
    }
}