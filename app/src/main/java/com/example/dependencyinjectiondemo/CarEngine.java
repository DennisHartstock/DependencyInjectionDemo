package com.example.dependencyinjectiondemo;

import javax.inject.Inject;

public class CarEngine {
    private EngineFlap engineFlap;

    @Inject
    public CarEngine(EngineFlap engineFlap) {
        this.engineFlap = engineFlap;
    }
}
