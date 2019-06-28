package com.goertek.runningtest.runningtest

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.goertek.runningtest.R
import com.goertek.runningtest.databinding.ActivityRunningMainBinding
import com.goertek.runningtest.main.BaseActivity
import com.goertek.runningtest.util.InjectorUtil

class RunningMainActivity : BaseActivity() {

    private val TAG = "RunningMainActivity"

    val viewModel by lazy {
        ViewModelProviders.of(this, InjectorUtil.getRunningModelFactory()).get(RunningViewModel::class.java)
    }

    private val bing by lazy {
        DataBindingUtil.setContentView<ActivityRunningMainBinding>(this,R.layout.activity_running_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}
