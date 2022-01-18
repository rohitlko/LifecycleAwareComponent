package com.rohit.lifecycleawarecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("Rohit_Test", "MainActivity_onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Rohit_Test", "MainActivity_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Rohit_Test", "MainActivity_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Rohit_Test", "MainActivity_onPause")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Rohit_Test", "MainActivity_onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Rohit_Test", "MainActivity_onStop")
    }

}