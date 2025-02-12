package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int el : coins) {
            while (money >= el) {
                money -= el;
                rsl[size] = el;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}