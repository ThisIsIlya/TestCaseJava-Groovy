package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4, 5, 5, 7, 7};

        Map<Integer, Integer> result = CounterJava.countElements(array);

        System.out.println(result);
    }
}