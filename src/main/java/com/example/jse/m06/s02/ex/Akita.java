package com.example.jse.m06.s02.ex;

public class Akita extends Dog {

    public Akita(int frequencyOfBarking) {
        super(frequencyOfBarking);
    }

    @Override
    public void bark() {
        System.out.println("Ich bin ein Akita " + getFrequencyOfBarking());
    }

    @Override
    public String toString() {
        return "Akita [frequency = " + getFrequencyOfBarking() + "]";
    }

}
