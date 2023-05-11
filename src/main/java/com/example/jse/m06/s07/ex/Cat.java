/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07.ex;

/**
 * Override exercise
 * 
 * Any class derives from Object, implicitly or explicitly
 */
public class Cat {
    private String name;
    private char gender;
    
    public Cat(String name, char gender) {
        super();
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", gender=" + gender + "]";
    } 
}
