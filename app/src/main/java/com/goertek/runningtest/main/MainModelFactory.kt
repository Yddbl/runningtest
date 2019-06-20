package com.goertek.runningtest.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.goertek.runningtest.data.MainRepository

class MainModelFactory (private val repository: MainRepository):ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}