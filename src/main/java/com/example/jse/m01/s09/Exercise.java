/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s09;

/**
 * A very simple exercise in three steps on array
 */
public class Exercise {
    /**
     * <li>(1) create an array with "one", "two", "three", "four" in it
     * <li>(2) print the number of its elements
     * <li>(3) print the last element
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // (1)
        String[] numbers = { "one", "two", "three", "four" };
        // String[] numbers = new String[4];
        // numbers[0] = "one";
        // numbers[1] = "two";
        // numbers[2] = "three";
        // numbers[3] = "four";

        // (2)
        System.out.println(numbers.length);

        // (3)
        System.out.println(numbers[numbers.length - 1]);

        System.out.println("Done");
    }
}
