/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * TODO: is-a Vehicle and Conditioning
 */
public class Car extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public Car() {
        log.info("Car created");
    }
    
    @Override
    public String toString() {
        return "a Car";
    }

    @Override
    public void setTemperature(int temp) {
        log.info("Car conditioned: " + temp);
    }
}
