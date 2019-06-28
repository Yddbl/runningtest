package com.goertek.runningtest.main

import com.goertek.runningtest.util.Constant
import com.goertek.runningtest.util.SpUtils

open class BaseDao {

    fun putCurrentProject(value: Int){
        SpUtils.putInt(Constant.RUN_MAIN,Constant.CURRENT_PROJECT,value)
    }

    fun getCurrentProject():Int{
        return SpUtils.getInt(Constant.RUN_MAIN,Constant.CURRENT_PROJECT)
    }

}