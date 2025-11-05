package com.condegnan.oopexamples;

import java.util.Scanner;

public class VehicleAQ3 {
	String vehicleNo;
    String brand;
    double fuelConsumed;
    double distanceTravelled;

    // Default constructor
    public VehicleAQ3() {
        this("Unknown", "Unknown", 0.0, 0.0);
    }

    // Constructor with 2 parameters
    public VehicleAQ3(String vehicleNo, String brand) {
        this(vehicleNo, brand, 0.0, 0.0);
    }

    // Constructor with 4 parameters
    public VehicleAQ3(String vehicleNo, String brand, double fuelConsumed, double distanceTravelled) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.fuelConsumed = fuelConsumed;
        this.distanceTravelled = distanceTravelled;
    }
    
 // Method to calculate mileage
    public double calculateMileage() {
        if (this.fuelConsumed == 0) {
            return 0.0; // to avoid division by zero
        }
        return this.distanceTravelled / this.fuelConsumed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Vehicle No: " + this.vehicleNo);
        System.out.println("Brand: " + this.brand);
        System.out.println("Fuel Consumed: " + this.fuelConsumed);
        System.out.println("Distance Travelled: " + this.distanceTravelled);
        System.out.println("Mileage: " + this.calculateMileage() + " km/l");
    }
    
    
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String no = sc.next();
        String brand = sc.next();
        double fuel = sc.nextDouble();
        double distance = sc.nextDouble();
        sc.close();

        VehicleAQ3 v1 = new VehicleAQ3(no, brand, fuel, distance);
        v1.displayDetails();
    }
}
