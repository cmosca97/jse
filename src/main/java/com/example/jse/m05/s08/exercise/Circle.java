/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s08.exercise;

import java.util.logging.Logger;

/**
 * Complete the code
 * 
 * @see Main the user class
 */
public class Circle {
    
//    oggetto standard per il log
    private static final Logger log = Logger.getGlobal();
    private double radius;

    /**
     * Constructor
     * 
     * @param radius the circle radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * The circle area is π * radius ^ 2
     * 
     * @return the circle area
     */
    public double area() {
        log.info("Messaggio di prova");
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * The circle area is 2 * π * radius
     * 
     * @return the circle perimeter
     */
    public double perimeter() {
        log.info("Secondo messaggio di prova");
        return 2 * Math.PI * radius;
    }
}
