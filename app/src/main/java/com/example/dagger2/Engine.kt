package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){
    private val TAG = "Engine"
    init {
        Log.d(TAG, "MyCar :engin ")
    }


    public fun startEngine(){
        Log.d(TAG, "MyCar startEngine: with horsepower  5")
    }
}