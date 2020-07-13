package com.mysterycode.iamutil.test

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mysterycode.iamutil.LogUtil
import com.mysterycode.iamutil.R
import com.mysterycode.iamutil.ScreenAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ScreenAdapter.setCustomDensity(this,application)
        setContentView(R.layout.activity_main)


        tvLogUtil.setOnClickListener { LogUtil.e("Test Error Log.") }
    }
}
