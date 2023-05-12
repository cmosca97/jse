/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

/**
 * TODO: Bus is-a Vehicle and Conditioning
 */
public class Bus extends Vehicle implements Conditioning {
    private static final Logger log = Logger.getGlobal();

    /**
     * No-arg constructor
     */
    public Bus() {
        log.info("Bus created");
    }
    
    @Override
    public String toString() {
        return "a Bus";
    }
    
    @Override
    public void setTemperature(int temp) {
        log.info("Bus conditioned: " + temp);
    }

}
