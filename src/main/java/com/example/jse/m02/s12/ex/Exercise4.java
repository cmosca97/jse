/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12.ex;

/**
 * Control flow - Loop: for
 */
public class Exercise4 {
    /**
     * Using a for loop, print the first elements in args, but not more than three
     * of them.
     * <p>
     * For example:
     * <li>["ciao", "hello"] -> "ciao" "hello"
     * <li>["ciao", "hello", "ciao", "hello"] -> "ciao" "hello" "ciao"
     * 
     * @param args The caller could pass us 0 ... n arguments
     */
    public static void main(String[] args) {

        int end = Math.min(args.length, 3);
        for (int i = 0; i < end; i++) {
            System.out.println(args[i]);
        }
    }
}
