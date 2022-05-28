package com.example.dependencyinjectiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EngineFlap engineFlap = new EngineFlap();
        CarEngine carEngine = new CarEngine(engineFlap);
        CarBattery carBattery = new CarBattery();
        CarChassis carChassis = new CarChassis();

        Car car = new Car(carEngine, carBattery, carChassis);
        car.setCarChassis(carChassis);
        car.move();
    }
}