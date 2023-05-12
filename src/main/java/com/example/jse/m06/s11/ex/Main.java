/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.Arrays;

/**
 * Interface vs class exercise
 */
public class Main {
    /**
     * See requests in the "to do" comments
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: (1) put objects of (at least) three different types in this array
        Bus bus = new Bus();
        Car car = new Car();
        MotorBike motorbike = new MotorBike();

        Vehicle[] vehicles = { bus, car, motorbike };
        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions
        for (int i = 0; i < vehicles.length; i++) {
            if (i % 2 == 0) {
                vehicles[i].steer(false);
            } else {
                vehicles[i].steer(true);
            }
        }

        // TODO: (3) put objects of (at least) three different types in this array
        Conditioning[] conditionings = { bus, car, new Flat() };
        System.out.println(Arrays.toString(conditionings));

        // TODO: (4) set the temperature of each conditioned to 20
        for (int i = 0; i < conditionings.length; i++) {
            conditionings[i].setTemperature(Conditioning.DEFAULT_TEMPERATURE);
        }
    }
}
