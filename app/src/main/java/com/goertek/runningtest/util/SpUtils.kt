package com.goertek.runningtest.util

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.goertek.runningtest.main.App

/**
 * Sp工具类
 */
object SpUtils {

    val TAG = "SpUtils"

    val runSpName = "runSp"

    val mmi1SpName = "mmi1Sp"

    val mmi2SpName = "mmi2Sp"

    val mmi3SpName = "mmi3Sp"

    fun putString(spFileName: String, key: String, value: String) {
        App.context.getSharedPreferences(spFileName, Context.MODE_PRIVATE).edit {
            putString(key, value)
        }
        Log.d(TAG, "putString: $value")
    }

    fun putInt(spFileName: String, key: String, value: Int) {
        App.context.getSharedPreferences(spFileName, Context.MODE_PRIVATE).edit {
            putInt(key, value)
        }
        Log.d(TAG, "putInt: $value")
    }

    fun getInt(spFileName:String,key:String):Int {
        return App.context.getSharedPreferences(spFileName,Context.MODE_PRIVATE).getInt(key,-1)
    }

    fun putLong(spFileName: String,key: String,value:Long){
        App.context.getSharedPreferences(spFileName,Context.MODE_PRIVATE).edit{
            putLong(key,value)
        }
        Log.d(TAG, "putLong: $value")
    }

    private fun SharedPreferences.edit(action: SharedPreferences.Editor.() -> Unit) {
        val editor = edit()
        action(editor)
        editor.apply()
    }

}