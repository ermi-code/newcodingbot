package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        // Create a Car instance
        Car car = new Car();
        car.setSpeed(120.0); // Speed in Kph
        car.setFuelLevel(50.0f); // Fuel level in percentage
        car.drive(5000); // Drive 5 kilometers (5000 meters)

        // Display Car details
        System.out.println("Car speed in MPH: " + car.getSpeedMph());
        System.out.println("Car distance traveled in KM: " + car.getDistanceKm());
        System.out.println("Car remaining fuel: " + car.calculateRemainingFuel(5000) + "%");

        // Create an ElectricCar instance
        ElectricCar electricCar = new ElectricCar();
        electricCar.setSpeed(100.0); // Speed in Kph
        electricCar.setFuelLevel(80.0f); // Fuel level in percentage
        electricCar.setBatteryLevel(90.0); // Battery level in percentage
        electricCar.drive(15000); // Drive 15 kilometers (15000 meters)

        // Display ElectricCar details
        System.out.println("ElectricCar speed in MPH: " + electricCar.getSpeedMph());
        System.out.println("ElectricCar distance traveled in KM: " + electricCar.getDistanceKm());
        System.out.println("ElectricCar remaining fuel: " + electricCar.calculateRemainingFuel(15000) + "%");
        System.out.println("ElectricCar remaining battery: " + electricCar.getBatteryLevel() + "%");
    }
}
