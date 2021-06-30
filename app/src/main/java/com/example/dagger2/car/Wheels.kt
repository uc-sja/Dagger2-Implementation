package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    private  val TAG = "Wheels"
    init {
        Log.d(TAG, ":MyCar wheels ")
    }
}