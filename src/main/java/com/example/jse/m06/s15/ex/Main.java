/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex;

/**
 * Exercise: create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 */
public class Main {
    /**
     * Create a bunch of actors
     * <p>
     * Let them fight against each others
     * <p>
     * Peer-to-peer fight, the most skilled one wins
     * <p>
     * Wizards always beat warriors
     * <p>
     * In the end, let the user knows who survived
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // TODO: create actors, both warriors and wizards
        Actor[] actors = { new Warrior("Xena", 200), new Wizard("Harry", 60), new Wizard("Merlin", 150),
                new Warrior("Lee", 150) };

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        boolean winner = false;
        System.out.println("Let's fight ...");
        for (int i = 0; i < actors.length; i++) {
            for (int j = 0; j < actors.length; j++) {
                if (actors[i] != actors[j] && actors[i].isAlive() && actors[j].isAlive()) {
                    winner = actors[i].fight(actors[j]);
                    if (!winner) {
                        actors[i].setAlive(false);
                    } else {
                        actors[j].setAlive(false);
                    }
                }
            }
        }
        System.out.println("Survivors:");
        for(Actor actor : actors) {
            if(actor.isAlive()) {
                System.out.println(actor);
            }
        }
    }
}
