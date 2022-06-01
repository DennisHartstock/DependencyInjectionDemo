package com.example.dependencyinjectiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Inject
    CarBattery carBattery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent carComponent = DaggerCarComponent.create();
        CarComponent carComponent = DaggerCarComponent.builder()
                .carChassisModule(new CarChassisModule(1000))
                .build();
//        car = carComponent.getCar();
//
        carComponent.inject(this);

//        EngineFlap engineFlap = new EngineFlap();
//        CarEngine carEngine = new CarEngine(engineFlap);
//        CarBattery carBattery = new CarBattery();
//        CarChassis carChassis = new CarChassis();

//        Car car = new Car(carEngine, carBattery, carChassis);
//        car.setCarChassis(carChassis);
        car.move();
    }
}