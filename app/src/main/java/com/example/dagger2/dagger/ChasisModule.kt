package com.example.dagger2.dagger

import com.example.dagger2.car.Chasis
import com.example.dagger2.car.SporChasis
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class ChasisModule(private val body: String, private val color: String) {
    @Provides
    fun providesChasis(): Chasis {
        return  SporChasis(body, color)
    }

}