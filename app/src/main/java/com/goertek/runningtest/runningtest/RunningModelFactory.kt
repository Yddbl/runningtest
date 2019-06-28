package com.goertek.runningtest.runningtest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.goertek.runningtest.data.RunningRepository

class RunningModelFactory(private val runningRepository: RunningRepository) :ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RunningViewModel(runningRepository) as T
    }
}