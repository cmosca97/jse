package com.example.jse.m05.s03.my;

public class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
//        super();
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + "]";
    }
    public String steer(boolean left) {       
        return "I steered " + (left ? "left" : "right");
    }
}
