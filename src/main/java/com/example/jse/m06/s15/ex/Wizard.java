package com.example.jse.m06.s15.ex;

import java.util.logging.Logger;

public class Wizard extends Actor {
    private static final Logger log = Logger.getGlobal();

    protected Wizard(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean fight(Actor enemy) {
        if (enemy instanceof Wizard && enemy.getExperience() > this.getExperience()) {
            log.info(enemy.getName() + " won!");
            this.setAlive(false);
            return false;
        }
        log.info(getName() + " won!");
        enemy.setAlive(false);
        return true;
    }

    @Override
    public String toString() {
        return String.format("Wizard (%b) %s", this.isAlive(), this.getName());
    }

}
