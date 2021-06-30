package com.example.dagger2.dagger

import com.example.dagger2.car.Car
import com.example.dagger2.MainActivity
import dagger.Component

@Component(modules = [EngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun abc(activity: MainActivity)

    fun inject(car: Car)
}