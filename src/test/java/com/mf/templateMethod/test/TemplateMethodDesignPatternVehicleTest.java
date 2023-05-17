package com.mf.templateMethod.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.mf.templateMethod.Car;
import com.mf.templateMethod.Motorcycle;
import com.mf.templateMethod.Vehicle;

public class TemplateMethodDesignPatternVehicleTest {

    @Test
    public void testCarManufacturingProcess() {
        Vehicle car = new Car();
        car.manufacture();

        Assert.assertEquals(4, car.getNumberOfWheels());
        Assert.assertTrue(car.hasSteeringWheel());
    }

    @Test
    public void testMotorcycleManufacturingProcess() {
        Vehicle motorcycle = new Motorcycle();
        motorcycle.manufacture();

        Assert.assertEquals(2, motorcycle.getNumberOfWheels());
        Assert.assertFalse(motorcycle.hasSteeringWheel());
    }
}

