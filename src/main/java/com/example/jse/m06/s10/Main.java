/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

/**
 * Inheritance
 */
public class Main {
    /**
     * A few interconnected objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Object[] objects = { new Man("Tom"), //
                Werewolf.createByHumanAndWolfName("Wally", "Wawaally"), //
                new Wolf() }; //

        for (Object object : objects) {
            System.out.println(object.toString());
        }

        Werewolf ww = Werewolf.createByHumanAndWolfName("Uli", "Uououoo");
        ww.howl();
        ww.sayHello();
        ww.sayHowllo();
    }
}
