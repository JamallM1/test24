package com.galvanize;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.add(2, 3);
        assertEquals(expected, actual);
    }
}