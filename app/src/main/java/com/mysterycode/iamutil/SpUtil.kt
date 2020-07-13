package com.mysterycode.iamutil

import android.content.Context
import com.mysterycode.iamutil.test.TestApplication

object SpUtil {

    private val sharedPreferences = TestApplication.context.getSharedPreferences(TestApplication.context.packageName + "_preferences", Context.MODE_PRIVATE)
    private val editor= sharedPreferences.edit()

    fun putString(key: String, value: String) {
        editor.putString(key, value).apply()
    }

    fun getString(key: String, defValue: String? = "") = sharedPreferences.getString(key, defValue)
        ?: defValue?:""

    fun putBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value).apply()
    }

    fun getBoolean(key: String) = sharedPreferences.getBoolean(key, false)

    fun putInt(key: String, value: Int) {
        editor.putInt(key, value).apply()
    }

    fun getInt(key: String, defValue: Int? = 0) = sharedPreferences.getInt(key, defValue ?: 0)

    fun putLong(key: String, value: Long) {
        editor.putLong(key, value).apply()
    }

    fun getLong(key: String, defValue: Long? = 0L) = sharedPreferences.getLong(key, defValue ?: 0L)

}