package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodReturnTypeTest {

    @Test
    public void testText() {
        String expectedText = "Java is Okay";
        String actualText = MethodReturnType.text();
        assertEquals(expectedText, actualText);
    }

    @Test
    public void testNum() {
        double expectedNum = 3.14;
        double actualNum = MethodReturnType.num();
        assertEquals(expectedNum, actualNum, 0.0001);
    }

    @Test
    public void testBoo() {
        boolean expectedBoo = false;
        boolean actualBoo = MethodReturnType.boo();
        assertEquals(expectedBoo, actualBoo);
    }

}
