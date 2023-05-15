package com.example.jse.m06.s02.ex;

public class Dog {
    public static final int LOWEST_FREQUENCY = 50;
    public static final int DEFAULT_FREQUENCY = 100;
    public static final int HIGHEST_FREQUENCY = 200;
    private int frequencyOfBarking;

    public Dog(int frequencyOfBarking) {
        setFrequencyOfBarking(frequencyOfBarking);
    }

    public int getFrequencyOfBarking() {
        return frequencyOfBarking;
    }

    public void setFrequencyOfBarking(int frequencyOfBarking) {
        if (frequencyOfBarking >= LOWEST_FREQUENCY && frequencyOfBarking <= HIGHEST_FREQUENCY) {
            this.frequencyOfBarking = frequencyOfBarking;
        } else {
            this.frequencyOfBarking = DEFAULT_FREQUENCY;
        }
    }

    public void bark() {
        System.out.println("Ich bin ein Hund " + frequencyOfBarking);
    }

    @Override
    public String toString() {
        return "Dog [frequency = " + frequencyOfBarking + "]";
    }

}
