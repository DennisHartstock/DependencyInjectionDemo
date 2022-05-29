package com.example.dependencyinjectiondemo;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();
}
