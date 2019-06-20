package com.goertek.runningtest.data

import com.goertek.runningtest.data.db.MainDao
import com.goertek.runningtest.data.model.ProjectTestResult
import com.goertek.runningtest.util.Constant
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepository private constructor(private val mainDao: MainDao){

     fun getResults() = withContext(Dispatchers.IO) {
        var list = mainDao.getResults()
        if (list == null || list.isEmpty()) {
            list.add(ProjectTestResult(Constant.RUN,0))
            list.add(ProjectTestResult(Constant.MMI1,0))
            list.add(ProjectTestResult(Constant.MMI2,0))
            list.add(ProjectTestResult(Constant.MMI3,0))
        }
        list
    }

     fun saveResults(list:List<ProjectTestResult>?) = withContext(Dispatchers.IO) {

        mainDao.saveResults(list)
    }

    companion object {

        private lateinit var instance: MainRepository

        fun getInstance(mainDao: MainDao):MainRepository {
            if (!::instance.isInitialized) {
                synchronized(MainRepository::class.java){
                    if (!::instance.isInitialized) {
                        instance = MainRepository(mainDao)
                    }
                }
            }
            return instance
        }
    }

}