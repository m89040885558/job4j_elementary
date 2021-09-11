package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rst = 1;
        for (int i = 1; i <= n; i++) {
            rst = rst * i;
        }
            return rst;
    }
}