package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject

class SporChasis constructor(private val body: String, private val color: String) : Chasis {
    private  val TAG = "SportsChasis"

    override fun chasisBody() {
        Log.d(TAG, "MyCar body of the chasis is $body")
    }

    override fun chasisColor() {
        Log.d(TAG, "MyCar chasisColor: Color of the chasis is $color")
    }
}