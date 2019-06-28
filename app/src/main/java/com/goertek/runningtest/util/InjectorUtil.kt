package com.goertek.runningtest.util

import com.goertek.runningtest.data.MainRepository
import com.goertek.runningtest.data.RunningRepository
import com.goertek.runningtest.data.db.RunDataBase
import com.goertek.runningtest.main.MainModelFactory
import com.goertek.runningtest.runningtest.RunningModelFactory

object InjectorUtil {

    private fun getMainRepository() = MainRepository.getInstance(RunDataBase.getMainDao())

    private fun getRunningRepository() = RunningRepository.getInstance(RunDataBase.getRunDao())

    fun getMainModelFactory() = MainModelFactory(getMainRepository())

    fun getRunningModelFactory() = RunningModelFactory(getRunningRepository())
}