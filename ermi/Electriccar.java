package com.vehicle;

public class ElectricCar extends Car {
    // Additional field for electric cars
    private double batteryLevel; // Battery level in percentage

    // Setters
    public void setBatteryLevel(double battery) {
        if (battery >= 0.0 && battery <= 100.0) {
            this.batteryLevel = battery;
        } else {
            System.out.println("Battery level must be between 0.0 and 100.0.");
        }
    }

    // Getter
    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    // Override the drive method to also reduce the battery level
    @Override
    public void drive(int distance) {
        super.drive(distance); // Call the parent class's drive method

        double distanceKm = distance / 1000.0; // Convert meters to kilometers
        double batteryConsumed = (distanceKm / 10.0); // 1% battery consumed for every 10 km
        this.batteryLevel -= batteryConsumed;
        if (this.batteryLevel < 0) {
            this.batteryLevel = 0;
        }
    }
}
