/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11.ex;

/**
 * Control flow - Loop: while / do-while
 */
public class Exercise5 {
    /**
     * Emulate multiplicative operators with the help of while or do-while loops.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        int multi = a * b;
        System.out.println("a * b = " + multi);
        // TODO (1) Get the same result without multiplying
        int mol = 0;
        int i = 0;
        while (i < b) {
            mol += a;
            i++;
        }
        System.out.println("a * b = " + mol);

        int div = a / b;
        System.out.println("a / b = " + div);
        // TODO (2) Get the same result without dividing
        int divi = a;
        int j = 0;
        while (j < b) {
            divi -= b;
            j++;
        }
        System.out.println("a / b = " + j);

        int mod = a % b;
        System.out.println("a % b = " + mod);
        // TODO (3) Get the same result without using the modulo operator
        int modu = a;
        int k = 0;
        while (k < b) {
            modu -= b;
            k++;
        }
        System.out.println("a % b = " + modu);
    }
}
