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
        int a = 29;
        int b = 34;

        // 1
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

        // 2
        int div = a / b;
        System.out.println("a / b = " + div);
        // TODO (2) Get the same result without dividing
//        int divi = a;
//        i = 0;
//        if (a < b) {
//            System.out.println("a / b = 0");
//        } else {
//            while (i < divi) {
//                divi -= b;
//                i++;
//            }
//            if(i > divi) {
//                System.out.println("a / b = " + (i - 1));
//            } else {
//                System.out.println("a / b = " + i);
//            }
//        }

        // 3
        int mod = a % b;
        System.out.println("a % b = " + mod);
        // TODO (3) Get the same result without using the modulo operator
//        if (b = 0) {
//            System.out.println("Cannot return the modulo of a / b, because b = 0");
//        }
//        
//        while (i < Math.min(modu, b)) {
//            modu -= b;
//            i++;
//        }
//        System.out.println("a % b = " + modu);
    }
}
