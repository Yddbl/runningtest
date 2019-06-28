package com.goertek.runningtest.data

import com.goertek.runningtest.data.db.RunningDao

class RunningRepository private constructor(private val runningDao: RunningDao) {

    companion object {
        private lateinit var instance: RunningRepository

        fun getInstance(runningDao: RunningDao): RunningRepository {
            if (!::instance.isInitialized) {
                synchronized(RunningRepository::class.java) {
                    if (!::instance.isInitialized) {
                        instance = RunningRepository(runningDao)
                    }
                }
            }
            return instance
        }
    }

}