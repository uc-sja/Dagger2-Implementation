package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class SporChasis @Inject constructor() : Chasis {
    private  val TAG = "SportsChasis"

    override fun chasisBody(body: String) {
        Log.d(TAG, "MyCar body of the chasis is ${body}")
    }

    override fun chasisColor(color: String) {
        Log.d(TAG, "MyCar chasisColor: Color of the chasis is ${color}")
    }
}