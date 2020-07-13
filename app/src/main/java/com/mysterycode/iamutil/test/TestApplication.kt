package com.mysterycode.iamutil.test

import android.app.Application
import android.content.Context

internal class TestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = this
    }

    companion object {
        lateinit var context: Context
    }
}