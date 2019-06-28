package com.goertek.runningtest.main

import androidx.lifecycle.ViewModel
import com.goertek.runningtest.data.MainRepository
import com.goertek.runningtest.data.model.ProjectTestResult
import com.goertek.runningtest.util.Constant

class MainViewModel(private val repository: MainRepository) : ViewModel() {


    fun getResults(): List<ProjectTestResult> {
        return repository.getResults()
    }

    fun saveResulits(results: List<ProjectTestResult>?) {
        repository.saveResults(results)
    }

    fun getProjectItem(): Item {
        var results = getResults()
        var run: Int = 0
        var mmi1: Int = 0
        var mmi2: Int = 0
        var mmi3: Int = 0
        for (result: ProjectTestResult in results) {
            when (result.projectName) {
                Constant.RUN -> run = result.result
                Constant.MMI1 -> mmi1 = result.result
                Constant.MMI2 -> mmi2 = result.result
                Constant.MMI3 -> mmi3 = result.result
            }
        }
        var project = -1

        if (mmi1 == 1 && run == 1) {
            project = 2
            return Item.MMI2
        }
        if (mmi1 == 1 && run == 0) {
            project = 0
            return Item.RUN
        }
        //save current test project
        repository.putCurrentProject(project)
        return Item.UNKNOWN
    }
}

enum class Item {
    RUN,
    MMI1,
    MMI2,
    MMI3,
    UNKNOWN
}