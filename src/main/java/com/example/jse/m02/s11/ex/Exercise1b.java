package com.example.jse.m02.s11.ex;

import java.util.Arrays;

public class Exercise1b {
    public static void main(String[] args) {
        String[] words = { "alfa", "beta", "gamma", "delta" };
        int i = 0;

        while (i < words.length) {
            System.out.println(words[i]);
            i++;
        }
        System.out.println("Our array is " + Arrays.toString(words));
    }
}
