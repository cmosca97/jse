/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex;

import java.util.ArrayList;
import java.util.List;

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
        List<Actor> actors = new ArrayList<>(List.of(new Warrior("Xena", 200), new Warrior("Lee", 150),
                new Wizard("Harry", 60), new Wizard("Merlin", 150)));

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        boolean winner = false;
        System.out.println("Let's fight ...");
        for (int i = 0; i < actors.size(); i++) {
            for (int j = 0; j < actors.size(); j++) {
                if (actors.get(i) != actors.get(j) && actors.get(i).isAlive() && actors.get(j).isAlive()) {
                    winner = actors.get(i).fight(actors.get(j));
                    if (!winner) {
                        actors.get(i).setAlive(false);
                    } else {
                        actors.get(i).setAlive(false);
                    }
                }
            }
        }
        System.out.println("Survivors:");
        for (Actor actor : actors) {
            if (actor.isAlive()) {
                System.out.println(actor);
            }
        }
    }
}
