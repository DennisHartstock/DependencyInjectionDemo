package com.example.dependencyinjectiondemo;

import dagger.Module;
import dagger.Provides;

@Module
public class CarChassisModule {

    @Provides
    static CarChassis provideCarChassis() {
        return new CarChassis();
    }
}
