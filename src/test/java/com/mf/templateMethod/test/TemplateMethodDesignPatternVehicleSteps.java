package com.mf.templateMethod.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.mf.templateMethod.CarManufacturer;
import com.mf.templateMethod.MotorcycleManufacturer;
import com.mf.templateMethod.Vehicle;
import com.mf.templateMethod.VehicleManufacturer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "telmplateMethod-design-pattern.feature")
public class TemplateMethodDesignPatternVehicleSteps {
    private VehicleManufacturer vehicleManufacturer;
    private Vehicle vehicle;

    @Given("^a car manufacturer$")
    public void aCarManufacturer() {
        vehicleManufacturer = new CarManufacturer();
    }

    @Given("^a motorcycle manufacturer$")
    public void aMotorcycleManufacturer() {
        vehicleManufacturer = new MotorcycleManufacturer();
    }

    @When("^I manufacture a car$")
    public void iManufactureACar() {
        vehicle = vehicleManufacturer.manufactureVehicle();
    }

    @When("^I manufacture a motorcycle$")
    public void iManufactureAMotorcycle() {
        vehicle = vehicleManufacturer.manufactureVehicle();
    }

    @Then("^the car should have (\\d+) wheels$")
    public void theCarShouldHaveWheels(int expectedWheels) {
        assertEquals(expectedWheels, vehicle.getNumberOfWheels());
    }

    @Then("^the car should have a steering wheel$")
    public void theCarShouldHaveSteeringWheel() {
        assertTrue(vehicle.hasSteeringWheel());
    }

    @Then("^the motorcycle should have (\\d+) wheels$")
    public void theMotorcycleShouldHaveWheels(int expectedWheels) {
        assertEquals(expectedWheels, vehicle.getNumberOfWheels());
    }

    @Then("^the motorcycle should not have a steering wheel$")
    public void theMotorcycleShouldNotHaveSteeringWheel() {
        assertFalse(vehicle.hasSteeringWheel());
    }
}

