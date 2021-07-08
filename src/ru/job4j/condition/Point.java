package ru.job4j.condition;

public class Point {
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static double distance(int x1, int y1, int x2, int y2) {
       return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(3, 5, 2, 0);
        double result2 = Point.distance(33, 5, 28, 100);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (3, 5) to (2, 0) " + result1);
        System.out.println("result (35, 5) to (28, 100) " + result2);
    }
}