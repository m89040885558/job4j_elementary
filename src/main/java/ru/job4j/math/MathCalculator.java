package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

            public static double sumAndDiffandDiv(double first, double second) {
        return diff(first, second) + div(first, second);
      }

    public static double sumAndAll(double first, double second) {
        return sum(first, second) + diff(first, second) + div(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumAndDiffandDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAndAll(10, 20));
    }
}