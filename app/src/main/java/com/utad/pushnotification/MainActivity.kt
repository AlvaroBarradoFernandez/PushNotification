package com.utad.pushnotification

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //Aqui le decimos la version de android
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationUtils(this)
        }
    }
}
