package com.example.jse.m06.s02.ex;

public class Chihuahua extends Dog {

    public Chihuahua(int frequencyOfBarking) {
        super(frequencyOfBarking);
    }

    @Override
    public void bark() {
        System.out.println("Ich bin ein Chihuahua " + getFrequencyOfBarking());
    }

    @Override
    public String toString() {
        return "Chihuahua [frequency = " + getFrequencyOfBarking() + "]";
    }
}
