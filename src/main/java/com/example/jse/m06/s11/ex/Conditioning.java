/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11.ex;

/**
 * The conditioning classes should implement this interface
 * <p>
 * TODO: provide an abstract method to set the temperature to a given value
 */
public interface Conditioning {
    int DEFAULT_TEMPERATURE = 20;

    public void setTemperature(int temp);
}
