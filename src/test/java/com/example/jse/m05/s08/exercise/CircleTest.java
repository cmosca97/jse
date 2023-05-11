package com.example.jse.m05.s08.exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

import org.junit.jupiter.api.Test;


class CircleTest {
//    private double circle = 4.0;
//    private double circle2 = 0.0;
    
    @Test
    void areaPlain() {
        Circle circle = new Circle (4.0);
        double expected = 50.26;
        double actual = circle.area();
        assertThat(actual).isCloseTo(expected, withPrecision(.1));
    }
    
    @Test
    void areaZero() {
        Circle circle = new Circle (0.0);
        double expected = 0.0;
        double actual = circle.area();
        assertThat(actual).isEqualTo(expected);
    }
    
    @Test
    void perimeterPlain() {
        Circle circle = new Circle (4.0);
        double expected = 25.1;
        double actual = circle.perimeter();
        assertThat(actual).isCloseTo(expected, withPrecision(.1));
    }
    
    @Test
    void perimeterZero() {
        Circle circle = new Circle (0.0);
        double expected = 0.0;
        double actual = circle.perimeter();
        assertThat(actual).isEqualTo(expected);
    }
}
