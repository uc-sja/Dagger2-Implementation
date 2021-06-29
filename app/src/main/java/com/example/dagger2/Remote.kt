package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    private val TAG = "Remote"
    fun setListener(car: Car){
        Log.d(TAG, "MyCar setListener: ")
        car.engine.startEngine()
    }
}