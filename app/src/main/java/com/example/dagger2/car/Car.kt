package com.example.dagger2.car

import android.util.Log
import javax.inject.Inject


//constructor injection
//Engine and all its dependencies is condidered as a read only third pary class
//Hence instead of using @Inject annotation we are using Module approach which provides
//default implementations

//Chasis is an interface hence without a constructor
class Car @Inject constructor( val engine: Engine, private val wheels: Wheels, private val chasis: Chasis){
    private val TAG = "Car"


    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        Log.d(TAG, "MyCar drive: at 20Kmph")
        (chasis as  SporChasis).chasisBody("light")
        (chasis as  SporChasis).chasisColor("red")
    }
}