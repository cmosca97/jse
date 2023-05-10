package com.example.jse.m05.s03.my;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
    private Car car = new Car("", "");

    @Test
    void steerLeft() {

        boolean input = true;
        String expected = "I steered left";
        String actual = car.steer(input);
        assertEquals(expected, actual);
    }

    @Test
    void steerRight() {

        boolean input = false;
        String expected = "I steered right";
        String actual = car.steer(input);
        assertEquals(expected, actual);
    }
}
