package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageMethodTest {

    @Test
    public void testSum() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int expectedSum = 10 + 20 + 30;
        int actualSum = sum(num1, num2, num3);
        assertEquals(expectedSum, actualSum);
    }

    private static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    @Test
    public void testAverage() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        double expectedAverage = (10 + 20 + 30) / 3.0;
        double actualAverage = average(num1, num2, num3);
        assertEquals(expectedAverage, actualAverage, 0.0001);
    }

    private static double average(int num1, int num2, int num3) {
        return (double) sum(num1, num2, num3) / 3;
    }
}

