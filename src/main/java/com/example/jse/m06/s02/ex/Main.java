package com.example.jse.m06.s02.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = { new Dog(100), new Chihuahua(150), new Dalmatiner(80), new Akita(70), new Dog(20) };
        System.out.println(Arrays.toString(dogs));
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark();
        }
        f(dogs[dogs.length - 1]);
    }

    public static void f(Dog dog) {
        dog.setFrequencyOfBarking(Dog.HIGHEST_FREQUENCY);
        if (dog.getFrequencyOfBarking() > 90) {
            dog.bark();
        } else {
            System.out.println("The frequency of barking is too low");
        }
    }
}
