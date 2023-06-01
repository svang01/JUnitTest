package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);

        Set<Integer> expectedDistinctNumbers = new HashSet<>();
        expectedDistinctNumbers.add(1);
        expectedDistinctNumbers.add(2);
        expectedDistinctNumbers.add(3);
        expectedDistinctNumbers.add(4);

        Set<Integer> distinctNumbers = new HashSet<>(numbers);

        assertEquals(expectedDistinctNumbers, distinctNumbers);
    }

    @Test
    public void testSumAndAverage() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);

        int expectedSum = 1 + 2 + 3 + 4;
        double expectedAverage = (double) expectedSum / 4;

        Set<Integer> distinctNumbers = new HashSet<>(numbers);

        int sum = 0;
        for (int num : distinctNumbers) {
            sum += num;
        }
        double average = (double) sum / distinctNumbers.size();

        assertEquals(expectedSum, sum);
        assertEquals(expectedAverage, average);
    }
}
