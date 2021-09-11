package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int rst = first;
        if (second > first && second > third) {
            rst = second;
        }
        if (third > first) {
            rst = third;
        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 50, 100)); }
}
