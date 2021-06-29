package com.example.dagger2

import android.util.Log
import android.widget.Toast
import javax.inject.Inject


//constructor injection
class Car @Inject constructor(private val wheels: Wheels){
    private val TAG = "Car"

    //field injection
    @Inject lateinit var engine: Engine

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        Log.d(TAG, "MyCar drive: at 20Kmph")
    }
}