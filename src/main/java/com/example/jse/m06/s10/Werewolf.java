/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

/**
 * A man-wolf. Can't extends more than one class, so extends Man and implements
 * Wolfable
 */
public class Werewolf extends Man implements Wolfable {
    private String nameAsWolf;

    /**
     * 
     * @param nameAsHuman the human name
     * @param nameAsWolf  the werewolf name
     */
    private Werewolf(String nameAsHuman, String nameAsWolf) {
        super(nameAsHuman);
        this.nameAsWolf = nameAsWolf;
    }

//    Static factory method
    public static Werewolf createByHumanAndWolfName(String nameAsHuman, String nameAsWolf) {
        return new Werewolf(nameAsHuman, nameAsWolf);
    }

    /**
     * Specific werewolf method, something in between howl() and Man::sayHello()
     */

    // I use a getter to get the name from the class Man
    public void sayHowllo() {
        System.out.println("Howllo, I'm " + nameAsWolf);
    }

    @Override
    public void howl() {
        System.out.println("Howhowl, I'm " + nameAsWolf);
    }

    @Override
    public void attack(Man man) {
        System.out.printf("%s is attacking %s%n", getName(), man);
    }

    @Override
    public String toString() {
        return "A Werewolf named " + nameAsWolf;
    }
}
