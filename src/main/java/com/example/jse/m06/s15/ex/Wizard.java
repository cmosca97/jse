package com.example.jse.m06.s15.ex;

public class Wizard extends Actor {

    protected Wizard(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean fight(Actor enemy) {
        if (enemy instanceof Warrior) {
            System.out.println("I, " + getName() + ", have defeated " + enemy + "!");
            return true;
        }
        if (this.getExperience() > enemy.getExperience()) {
            System.out.println("I, " + getName() + ", have defeated " + enemy + "!");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Wizard " + getName();
    }

}
