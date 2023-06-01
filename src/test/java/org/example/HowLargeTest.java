package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowLargeTest {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string or press enter to exit:");
            String word = readInput();
            if (word.equals("")) {
                break;
            } else {
                myArray.add(word);
            }
        }

        System.out.println("The total amount of items in the list was: " + myArray.size());
    }

    private static String readInput() {
        InputStream savedStandardInputStream = System.in;
        String input = "";
        try {
            input = "example input";  // Replace this with the actual input value for testing
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            return new Scanner(System.in).nextLine();
        } finally {
            System.setIn(savedStandardInputStream);
        }
    }

    @Test
    public void testTotalItemsInList() {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Item 1");
        myArray.add("Item 2");
        myArray.add("Item 3");

        int expectedSize = 3;
        int actualSize = myArray.size();

        assertEquals(expectedSize, actualSize);
    }
}
