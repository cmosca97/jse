package com.example.jse.m02.s12;

public class For2 {
    public static void main(String[] args) {
        for (int i = 0; i < 16; i+=3) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        int[] values = {3,6,8,2,1,5};
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                System.out.println(values[i]);
            }
        }
    }
}
