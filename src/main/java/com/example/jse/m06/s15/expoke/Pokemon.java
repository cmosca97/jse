package com.example.jse.m06.s15.expoke;

import java.util.Scanner;

public final class Pokemon {
    private String name;
    private int experience;
    private int level;
    private int evoStageCount;

    public Pokemon(String name, int evoStageCount) {
        this.name = name;
        this.experience = 0;
        this.level = 1;
        this.evoStageCount = evoStageCount;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public void objectUse(int quantity) {
        experience += 100 * quantity;
    }

    public void fightResult(boolean victory) {
        experience += 1000;
    }

    public void levelIncrease(int experience) {
        while (experience >= 200) {
            level += 1;
            experience -= 200;
        }
    }

    public void evolution(int level) {
        if (level >= 10 && level < 30 && evoStageCount >= 2) {
            Scanner in = new Scanner(System.in);
            System.out.print("New second name: ");
            String nameTwo = in.nextLine();
            System.out.println("Congratulations! Your " + name + " evolved into " + nameTwo + "!");
            in.close();
            name = nameTwo;
        } else if (level >= 30 && evoStageCount >= 3) {
            Scanner in = new Scanner(System.in);
            System.out.print("New third name: ");
            String nameThree = in.nextLine();
            System.out.println("Congratulations! Your " + name + " evolved into " + nameThree + "!");
            in.close();
            name = nameThree;
        } else {
            System.out.println("Evolution not possible!");
        }
    }
}
