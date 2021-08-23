package ru.job4j.array;

public class Square {
    public static int[] calc(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
                  rst[index] = (int) Math.pow(index, 2);
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calc(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}