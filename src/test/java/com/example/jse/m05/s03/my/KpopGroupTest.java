package com.example.jse.m05.s03.my;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KpopGroupTest {
    private KpopGroup group = new KpopGroup("", "", 0);

    @Test
    void goOnTourYes() {
        boolean input = true;
        String expected = " is currently on tour";
        String actual = group.goOnTour(input);
        assertEquals(expected, actual);
    }
}