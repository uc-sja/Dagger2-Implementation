package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    private val TAG = "Remote"
    fun setListener(car: Car){
        Log.d(TAG, "MyCar Remote setListener: ")
        car.engine.startEngine()
    }
}