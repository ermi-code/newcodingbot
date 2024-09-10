package com.vehicle;

public class Car {
    
    private double speedKph; 
    private float fuelLevel; 
    private int distanceTraveled; 

    
    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    public void setFuelLevel(float fuel) {
        if (fuel >= 0.0f && fuel <= 100.0f) {
            this.fuelLevel = fuel;
        } else {
            System.out.println("Fuel level must be between 0.0 and 100.0.");
        }
    }

    
    public void drive(int distance) {
        this.distanceTraveled += distance;
        double distanceKm = distance / 1000.0; 
        double fuelConsumed = distanceKm * 0.5; 
        this.fuelLevel -= fuelConsumed;
        if (this.fuelLevel < 0) {
            this.fuelLevel = 0;
        }
    }

    
    public double getSpeedMph() {
        
        return this.speedKph / 1.60934;
    }

    public int getDistanceKm() {
        
        return this.distanceTraveled / 1000;
    }

    public int calculateRemainingFuel(double distance) {
        
        double fuelConsumed = (distance / 1000.0) * 0.5;
        return (int) Math.max(0, this.fuelLevel - fuelConsumed);
    }
    public class ElectricCar extends Car {
    
    private double batteryLevel; 

    
    public void setBatteryLevel(double battery) {
        if (battery >= 0.0 && battery <= 100.0) {
            this.batteryLevel = battery;
        } else {
            System.out.println("Battery level must be between 0.0 and 100.0.");
        }
    }

    
    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    
    @Override
    public void drive(int distance) {
        super.drive(distance); 

        double distanceKm = distance / 1000.0; 
        double batteryConsumed = (distanceKm / 10.0); 
        this.batteryLevel -= batteryConsumed;
        if (this.batteryLevel < 0) {
            this.batteryLevel = 0;
        }
    }
}
}
