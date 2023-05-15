package com.example.jse.m06.s02.ex;

public class Dalmatiner extends Dog {

    public Dalmatiner(int frequencyOfBarking) {
        super(frequencyOfBarking);
    }

    @Override
    public void bark() {
        System.out.println("Ich bin ein Dalmatiner " + getFrequencyOfBarking());
    }

    @Override
    public String toString() {
        return "Dalmatiner [frequency = " + getFrequencyOfBarking() + "]";
    }
}
