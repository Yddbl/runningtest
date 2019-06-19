package com.goertek.runningtest.data

import com.goertek.runningtest.data.db.MainDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepository private constructor(private val mainDao: MainDao){

    suspend fun getResults() = withContext(Dispatchers.IO) {
        var list = mainDao.getResults()
        if (list == null || list.isEmpty()) {
//            list.add(ProjectTestResult("Running"))
        }
    }
}