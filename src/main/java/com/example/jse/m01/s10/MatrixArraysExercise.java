/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s10;

import java.util.Arrays;

/**
 * Exercise on two-dimensional array
 */
public class MatrixArraysExercise {
    /**
     * <ol>
     * <li>Create a two line matrix
     * <ul>
     * <li>Row 1: "ciao", "buongiorno"
     * <li>Row 2: "hello", "good morning"
     * </ul>
     * <li>Print the first English greeting
     * <li>Convert the Italian greetings in a string and print it
     * <li>Convert the full matrix in a string and print it
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[][] greetings = { //
                { "ciao", "buongiorno" }, //
                { "hello", "good morning" } //
        };

//        String value = greetings[1][0];
//        System.out.println(value);
        System.out.println(greetings[1][0]);

//        String [] italianGreetings = greetings[0];
//        var s = Arrays.toString(italianGreetings);
//        System.out.println(s);
        System.out.println(Arrays.toString(greetings[0]));

        System.out.println(Arrays.deepToString(greetings));

        System.out.println("Done");
    }
}
