package com.example.jse.m10.s05.my;

import java.util.ArrayDeque;

public class Exercise {
    public static void main(String[] args) {
        String s = "Ohayougozaimasu";
        ArrayDeque<Character> buffer = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            buffer.push(s.charAt(i));
        }
        System.out.println(buffer);
        while (buffer.size() > 0) {
//            System.out.println(buffer.pop());
            buffer.pop();
            System.out.println(buffer);
        }
    }

}
