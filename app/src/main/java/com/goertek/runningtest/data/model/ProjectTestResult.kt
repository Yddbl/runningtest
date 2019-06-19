package com.goertek.runningtest.data.model

import com.google.gson.annotations.SerializedName
import org.litepal.crud.LitePalSupport

/**
 * result 0代表失败，1代表成功
 */
class ProjectTestResult(
    @SerializedName("name") val projectName: String,
    @SerializedName("result") val result: Int
) : LitePalSupport() {

    // 这个关键字表示该属性是「瞬时」的，不参与类的序列化
    @Transient
    val id = 0
}