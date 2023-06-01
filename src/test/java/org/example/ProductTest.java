package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void testPrintProduct() {
        Product product = new Product(4.0, 10.0, "Gallon of gas");
        String expectedOutput = "Gallon of gas cost 4.0 and 10.0 units were purchased.";

        // Capture the output written to the console
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method
        product.printProduct();

        // Restore the original System.out
        System.setOut(originalOut);

        // Get the actual output as a String
        String actualOutput = outputStream.toString().trim();

        // Compare the expected and actual outputs
        assertEquals(expectedOutput, actualOutput);
    }
}