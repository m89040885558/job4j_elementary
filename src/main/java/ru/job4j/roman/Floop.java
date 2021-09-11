package ru.job4j.roman;

public class Floop {
    public static void main (String args[]) {
        double nums[] = {10, 11, 12, 13, 14};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++)
         result = result + nums[i];
        System.out.println("Cpeднee значение равно " + result / 5);
    }
}
