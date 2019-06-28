package com.goertek.runningtest.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.goertek.runningtest.R
import com.goertek.runningtest.runningtest.RunningMainActivity
import com.goertek.runningtest.util.InjectorUtil

class MainActivity : BaseActivity() {

    private val TAG by lazy { "MainActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")
        val viewModel = ViewModelProviders.of(this, InjectorUtil.getMainModelFactory()).get(MainViewModel::class.java)
        val item = viewModel.getProjectItem()
        when (item) {
            Item.RUN -> {
                Log.d(TAG,"RUN")
                startActivity(Intent(this, RunningMainActivity::class.java))
            }
            Item.MMI1 -> {

            }
            Item.MMI2 -> {

            }

            Item.MMI3 -> {

            }
            Item.UNKNOWN -> {
                Log.d(TAG,"UNKNOWN")
                startActivity(Intent(this, RunningMainActivity::class.java))
            }
        }

    }


}
