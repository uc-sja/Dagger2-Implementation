package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    private  val TAG = "Wheels"
    init {
        Log.d(TAG, ":MyCar wheels ")
    }
}