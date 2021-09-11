package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 10;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 10;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then2() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To3() {
        int a = 3;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To5Then5() {
        int a = 3;
        int b = 2;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To5To9Then9() {
        int a = 3;
        int b = 2;
        int c = 5;
        int d = 9;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}