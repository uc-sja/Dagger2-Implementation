package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine constructor( ){
    private val TAG = "PetrolEngine"
    val horsepower = 400
    init {
        Log.d(TAG, "MyCar :petrol engine ")
    }


    fun startPetrolEngine(){
        Log.d(TAG, "MyCar petrol engine started: with horsepower  500")
    }
}