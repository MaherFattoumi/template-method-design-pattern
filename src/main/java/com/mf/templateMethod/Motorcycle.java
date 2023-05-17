package com.mf.templateMethod;

public class Motorcycle extends Vehicle {
    @Override
    public int getNumberOfWheels() {
        return 2;
    }

    @Override
    public boolean hasSteeringWheel() {
        return false;
    }
}


