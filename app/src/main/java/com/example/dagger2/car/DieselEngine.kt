package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class DieselEngine constructor( ){
    private  val TAG = "DieselEngine"
    val horsepower = 600
    init {
        Log.d(TAG, "MyCar :diesel engine ")
    }


    fun startPetrolEngine(){
        Log.d(TAG, "MyCar diesel engine started: with horsepower  1500")
    }
}