/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap exercise
 */
public class Exercise {
    /**
     * Extract non-duplicated values in input and return them as a Collection, for
     * example:
     * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public Collection<Integer> singles(int[] data) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int cur = data[i];
            Integer count = map.get(cur);
            if (count == null) {
                map.put(cur, 1);
            } else {
                map.put(cur, count + 1);
            }
        }
        Collection<Integer> result = new ArrayList<>();
        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Collection<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
        System.out.println(result);
    }
}
