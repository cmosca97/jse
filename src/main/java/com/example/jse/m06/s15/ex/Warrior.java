package com.example.jse.m06.s15.ex;

import java.util.logging.Logger;

public class Warrior extends Actor {
    private static final Logger log = Logger.getGlobal();

    protected Warrior(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean fight(Actor enemy) {
        if (enemy instanceof Warrior && this.getExperience() > enemy.getExperience()) {
            log.info(getName() + " won!");
            enemy.setAlive(false);
            return true;
        }
        log.info(enemy.getName() + " won!");
        this.setAlive(false);
        return false;
    }

    @Override
    public String toString() {
        return String.format("Warrior (%b) %s", this.isAlive(), this.getName());
    }

}
