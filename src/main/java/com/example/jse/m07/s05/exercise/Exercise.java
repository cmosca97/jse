package com.example.jse.m07.s05.exercise;

public class Exercise {
    public static int max(int[] numbers) throws Exception {
        if (numbers == null || numbers.length == 0) {
            throw new MaxException("Numbers should be a non-empty array");
        }
        int temp = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > temp) {
                temp = numbers[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        try {
            int[] numbers = {};
            int x = Exercise.max(numbers);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
