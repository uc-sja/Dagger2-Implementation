package com.example.dagger2.dagger

import com.example.dagger2.car.*
import dagger.Module
import dagger.Provides

@Module
class EngineModule {
    companion object {
        @Provides
        fun providesPetrolEngine(): PetrolEngine {
            return PetrolEngine()
        }


        @Provides
        fun providesDieselEngine(): DieselEngine {
            return DieselEngine()
        }


        @Provides
        fun providesEngine(petrolEngine: PetrolEngine, dieselEngine: DieselEngine): Engine {
            return Engine(petrolEngine, dieselEngine)
        }
    }
}