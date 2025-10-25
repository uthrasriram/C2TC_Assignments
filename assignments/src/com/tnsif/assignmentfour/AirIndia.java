package com.tnsif.assignmentfour;

public class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    // Default Constructor
    public AirIndia() {
    }

    // Parameterized Constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Method Implementation
    public double calculateAmount() {
        return hours * costPerHour;
    }
}


