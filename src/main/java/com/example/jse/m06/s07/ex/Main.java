/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07.ex;

/**
 * Override exercise
 * 
 * Complete the classes Cat, Dog, Mouse with a toString() override
 * 
 * Put instances of those classes in an array, and print them as strings
 */
public class Main {
    public static void main(String[] args) {
        Object minu = new Cat("Minu", 'f');
        System.out.println(minu.toString());
        System.out.println("***");
        
        Object rex = new Dog("Rex", 2);
        System.out.println(rex.toString());
        System.out.println("***");
        
        Object jerry = new Mouse("Jerry", "brown");
        System.out.println(jerry.toString());
        System.out.println("***");

        Object[] objects = {minu, rex, jerry};

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}
