package com.goertek.runningtest.util

import com.goertek.runningtest.data.MainRepository
import com.goertek.runningtest.data.db.RunDataBase
import com.goertek.runningtest.main.MainModelFactory

object InjectorUtil {

    private fun getMainRepository() = MainRepository.getInstance(RunDataBase.getMainDao())

    fun getMainModelFactory() = MainModelFactory(getMainRepository())

}