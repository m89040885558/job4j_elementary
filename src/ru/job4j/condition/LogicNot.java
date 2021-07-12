package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl1 = isEven(2);
        System.out.println(rsl1);
        boolean rsl2 = isPositive(2);
        System.out.println(rsl2);
        boolean rsl3 = notEven(2);
        System.out.println(rsl3);
        boolean rsl4 = notPositive(2);
        System.out.println(rsl4);
        boolean rsl5 = notEvenAndPositive(2);
        System.out.println(rsl5);
        boolean rsl6 = evenOrNotPositive(2);
        System.out.println(rsl6);
    }
}