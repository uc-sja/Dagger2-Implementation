package com.example.dagger2.dagger

import com.example.dagger2.car.*
import dagger.Module
import dagger.Provides

@Module
//Since all of the methods are static, hence we dont need to create an instance
// of the EngineModule class to access its methods
abstract class EngineModule {
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