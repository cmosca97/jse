package com.example.jse.m05.s03.my;

public class Main {
    public static void main(String[] args) {
        Car herbie = new Car("Volkswagen", "Beetle");
        System.out.println(herbie);
        String message = herbie.steer(true);
        System.out.println(message);

//        KpopGroup
        KpopGroup bts = new KpopGroup("BTS", "Big Hit", 10);
        System.out.println(bts);
        String message2 = bts.goOnTour(true);
        System.out.println(message2);

//        KpopGroupMember
        KpopGroupMember jin = new KpopGroupMember('m', "Kim Seokjin", 30, "South Korea");
        System.out.println(jin);
    }
}
