package com.dmitry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayNumber n = new ArrayNumber();

        for (int i = 0; i < 30; i++) {
            int value = (int) Math.round((Math.random() * 300) - 150);
            System.out.println(value);
            n.add(value);
        }

        n.optimize();
        System.out.println(Arrays.toString(n.select(-110, 80)));
    }
}
