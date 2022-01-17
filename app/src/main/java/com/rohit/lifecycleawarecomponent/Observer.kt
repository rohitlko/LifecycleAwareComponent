package com.rohit.lifecycleawarecomponent

import android.util.Log
import androidx.lifecycle.Lifecycle

import androidx.lifecycle.LifecycleObserver

import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d("Rohit_Test", "Observer_OnCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.d("Rohit_Test", "Observer_onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.d("Rohit_Test", "Observer_onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.d("Rohit_Test", "Observer_onPause")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.d("Rohit_Test", "Observer_onDestroy")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.d("Rohit_Test", "Observer_onStop")
    }
}