package com.example.jse.m05.s03.my;

public class Main {
    public static void main(String[] args) {
        Car herbie = new Car("Volkswagen", "Beetle");
        System.out.println(herbie);
        String message = herbie.steer(true);
        System.out.println(message);
    }
}
