package com.mf.templateMethod;

public class Car extends Vehicle {
    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public boolean hasSteeringWheel() {
        return true;
    }

    @Override
    public void addSteeringWheel() {
        // Specific implementation for cars
    }
}

