package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.car.Car
import com.example.dagger2.dagger.CarComponent
import com.example.dagger2.dagger.ChasisModule
import com.example.dagger2.dagger.DaggerCarComponent
import javax.inject.Inject as Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component: CarComponent =
            DaggerCarComponent
                .builder().chasisModule(ChasisModule("light", "red"))
                .build()

        component.abc(this)

//        val car:Car = component.getCar()

        car.drive()


    }
}