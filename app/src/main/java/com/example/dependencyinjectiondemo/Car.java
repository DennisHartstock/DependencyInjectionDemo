package com.example.dependencyinjectiondemo;

import android.util.Log;

public class Car {
    private CarEngine carEngine;
    private CarBattery carBattery;
    private CarChassis carChassis;

    public Car(CarEngine carEngine, CarBattery carBattery, CarChassis carChassis) {
        this.carEngine = carEngine;
        this.carBattery = carBattery;
        this.carChassis = carChassis;
    }

    public void setCarChassis(CarChassis carChassis) {
        this.carChassis = carChassis;
    }

    public void move() {
        Log.d("Car move()", "Car is moving");
    }
}
