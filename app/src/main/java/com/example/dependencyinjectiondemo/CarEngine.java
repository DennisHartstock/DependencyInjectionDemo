package com.example.dependencyinjectiondemo;

public class CarEngine {
    private EngineFlap engineFlap;

    public CarEngine(EngineFlap engineFlap) {
        this.engineFlap = engineFlap;
    }
}
