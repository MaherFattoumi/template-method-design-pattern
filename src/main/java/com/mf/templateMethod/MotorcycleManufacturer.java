package com.mf.templateMethod;

public class MotorcycleManufacturer extends VehicleManufacturer {
    @Override
    public Vehicle manufactureVehicle() {
        return new Motorcycle();
    }
}