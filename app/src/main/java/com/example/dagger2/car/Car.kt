package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject


//constructor injection
class Car @Inject constructor( val engine: Engine, private val wheels: Wheels){
    private val TAG = "Car"


    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        Log.d(TAG, "MyCar drive: at 20Kmph")
    }
}