package com.tommyfen.jetpackexercise.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifeCycleObserver: LifecycleObserver {
    companion object{
        const val TAG = "LifeCycleObserver"
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun activityOnCreate(){
        Log.d(TAG, "activity's onCreate() has invoke")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun activityOnStop() {
        Log.d(TAG, "activity's onStop() has invoke")
    }
}