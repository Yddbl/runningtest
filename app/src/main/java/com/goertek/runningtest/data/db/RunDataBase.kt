package com.goertek.runningtest.data.db

import android.util.Log

object RunDataBase {

    private val TAG="RunDataBase"

    private var mainDao: MainDao? = null

    private var runDao: RunningDao? = null

    fun getMainDao(): MainDao {
        Log.d(TAG,"getMainDao")
        if (mainDao == null) {
            mainDao = MainDao()
        }
        return mainDao!!
    }

    fun getRunDao():RunningDao{
        Log.d(TAG,"getRunDao")
        if (runDao == null) {
            runDao = RunningDao()
        }
        return runDao!!
    }
}