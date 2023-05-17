package com.mf.templateMethod;

public class CarManufacturer extends VehicleManufacturer {
    @Override
    public Vehicle manufactureVehicle() {
        return new Car();
    }
}