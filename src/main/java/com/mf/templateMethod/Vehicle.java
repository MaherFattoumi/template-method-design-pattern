package com.mf.templateMethod;

public abstract class Vehicle {
	public abstract int getNumberOfWheels();
	public abstract boolean hasSteeringWheel();

    public void manufacture() {
        assembleChassis();
        addEngine();
        addWheels();
        if (hasSteeringWheel()) {
            addSteeringWheel();
        }
        paint();
    }

    protected void assembleChassis() {
        // Common implementation for all vehicles
    }

    protected void addEngine() {
        // Common implementation for all vehicles
    }

    protected void addWheels() {
        // Common implementation for all vehicles
    }

    protected void addSteeringWheel() {
        // To be implemented by subclasses if applicable
    }

    protected void paint() {
        // Common implementation for all vehicles
    }
}
