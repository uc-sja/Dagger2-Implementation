package com.example.dagger2.dagger

import com.example.dagger2.car.Chasis
import com.example.dagger2.car.SporChasis
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ChasisModule {

    @Binds
    abstract fun bindsChasis(sportChasis: SporChasis): Chasis

}