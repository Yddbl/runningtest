package com.goertek.runningtest.data.db

import com.goertek.runningtest.data.model.ProjectTestResult
import org.litepal.LitePal

class MainDao {

    /**
     * 获取所有project的测试结果
     */
    fun getResults(): MutableList<ProjectTestResult> = LitePal.findAll(ProjectTestResult::class.java)

    /**
     * 存储多个测试结果
     */
    fun saveResults(results: List<ProjectTestResult>?) {
        if (results != null && results.isNotEmpty()) {
            LitePal.saveAll(results)
        }
    }
    
}