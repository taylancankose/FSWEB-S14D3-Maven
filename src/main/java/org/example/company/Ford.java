package org.example.company;

import org.example.Car;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": The Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": The Ford is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": The Ford is braking";
    }
}
