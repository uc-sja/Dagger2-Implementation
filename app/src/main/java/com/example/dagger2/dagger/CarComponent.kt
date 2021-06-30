package com.example.dagger2.dagger

import com.example.dagger2.car.Car
import com.example.dagger2.MainActivity
import com.example.dagger2.car.Chasis
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [EngineModule::class, ChasisModule::class])
interface CarComponent {
    fun getCar(): Car

    fun abc(activity: MainActivity)

    fun inject(car: Car)

    @Component.Builder
    interface Builder{
        //binds str  it
        @BindsInstance
        fun body(@Named("body") body: String):Builder

        @BindsInstance
        fun color(@Named("color") color: String):Builder

        fun build(): CarComponent
    }
}