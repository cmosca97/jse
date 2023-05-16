package com.example.jse.m06.s15.ex;

public class Warrior extends Actor {

    protected Warrior(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean fight(Actor enemy) {
        if (enemy instanceof Warrior) {
            if (this.getExperience() > enemy.getExperience()) {
                System.out.println("I, " + getName() + ", have defeated " + enemy + "!");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Warrior " + getName();
    }

}
