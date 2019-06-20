package com.goertek.runningtest.data.db

object RunDataBase {

    private var mainDao: MainDao? = null

    fun getMainDao():MainDao {
        if (mainDao == null){
            mainDao = MainDao()
        }
        return mainDao!!
    }
}