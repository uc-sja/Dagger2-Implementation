package com.example.dagger2

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car

    fun abc(activity: MainActivity)

    fun inject(car: Car)
}