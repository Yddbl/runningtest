package com.goertek.runningtest.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.goertek.runningtest.R
import com.goertek.runningtest.util.InjectorUtil

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this,InjectorUtil.getMainModelFactory()).get(MainViewModel::class.java)

    }


}
