package com.mysterycode.iamutil

import android.util.Log

object LogUtil {
    private val stackTraceElement = Thread.currentThread().stackTrace[4]

    /**
     * Key word to filter target out.
     */
    private const val filter = ">>>"

    /**
     * Save logs to local.
     */
    private const val saveLog = false

    /**
     * Allow logs print out.
     */
    private const val allow = true

    private fun java.lang.StackTraceElement.generateTag(): String {
        var tag = "%s.%s(Line:%d)" // 占位符
        var callerClazzName = className // 获取到类名
        callerClazzName = callerClazzName.substring(callerClazzName.lastIndexOf(".") + 1)
        tag = String.format(tag, callerClazzName, methodName, lineNumber) // 替换
        return "$filter$tag"
    }

    private fun msgLegal(msg: String?) = msg ?: "Message is Null."

    fun v(message: String?) {
        if (!allow) return
        Log.v(stackTraceElement.generateTag(), msgLegal(message))
    }

    fun d(message: String?) {
        if (!allow) return
        Log.d(stackTraceElement.generateTag(), msgLegal(message))
    }

    fun i(message: String?) {
        if (!allow) return
        Log.i(stackTraceElement.generateTag(), msgLegal(message))
    }

    fun w(message: String?) {
        if (!allow) return
        Log.w(stackTraceElement.generateTag(), msgLegal(message))
    }

    fun e(message: String?) {
        if (!allow) return
        Log.e(stackTraceElement.generateTag(), msgLegal(message))
    }
}