package com.goertek.runningtest.data.db

import com.goertek.runningtest.data.model.ProjectTestResult
import com.goertek.runningtest.main.BaseDao
import org.litepal.LitePal

class MainDao : BaseDao() {

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