package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(private val petrolEngine: PetrolEngine, private val dieselEngine: DieselEngine){
    private val TAG = "Engine"
    init {
        Log.d(TAG, "MyCar :engine")
    }


    public fun startEngine(){
        Log.d(TAG, "MyCar startEngine: with horsepower  of petrol as ${petrolEngine.horsepower} and of diesel is ${dieselEngine.horsepower}")
    }
}