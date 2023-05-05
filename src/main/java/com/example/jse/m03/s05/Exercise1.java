package com.example.jse.m03.s05;

public class Exercise1 {
    static boolean hasI(String s) {
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'i') {
                return true;
            }
        }
        return false;
    }

    static int countI(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'i') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String esempio = "Supercalifragilistichespiralidoso";
        
        boolean flag = hasI(esempio);
        System.out.println(flag);

        int count = countI(esempio);
        System.out.println("Supercalifragilistichespiralidoso has " + count + " i");
    }
}
