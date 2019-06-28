package com.goertek.runningtest.data

import com.goertek.runningtest.data.db.MainDao
import com.goertek.runningtest.data.model.ProjectTestResult
import com.goertek.runningtest.util.Constant

class MainRepository private constructor(private val mainDao: MainDao) {

//    suspend fun getResults() = withContext(Dispatchers.IO) {
//        var list = mainDao.getResults()
//        if (list == null || list.isEmpty()) {
//            list.add(ProjectTestResult(Constant.RUN,0))
//            list.add(ProjectTestResult(Constant.MMI1,0))
//            list.add(ProjectTestResult(Constant.MMI2,0))
//            list.add(ProjectTestResult(Constant.MMI3,0))
//        }
//        list
//    }

//    suspend fun saveResults(list:List<ProjectTestResult>?) = withContext(Dispatchers.IO) {
//
//        mainDao.saveResults(list)
//    }

    fun putCurrentProject(value:Int) {
        mainDao.putCurrentProject(value)
    }

    fun saveResults(list: List<ProjectTestResult>?) {
        mainDao.saveResults(list)
    }

    fun getResults():List<ProjectTestResult> {
        var list = mainDao.getResults()
        if (list == null || list.isEmpty()) {
            list.add(ProjectTestResult(Constant.RUN, 0))
            list.add(ProjectTestResult(Constant.MMI1, 0))
            list.add(ProjectTestResult(Constant.MMI2, 0))
            list.add(ProjectTestResult(Constant.MMI3, 0))
            saveResults(list)
        }
        return list
    }

    companion object {

        private lateinit var instance: MainRepository

        fun getInstance(mainDao: MainDao): MainRepository {
            if (!::instance.isInitialized) {
                synchronized(MainRepository::class.java) {
                    if (!::instance.isInitialized) {
                        instance = MainRepository(mainDao)
                    }
                }
            }
            return instance
        }
    }

}