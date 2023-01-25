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

    public class StatsTest {
        @Test
        public void testIdenticalNumbers() {
            Stat stats  = new Stats();
            int expected = 8;
            int actual = stats.computeMode(ata);
            assertEquals(expected, actual);
        }
        @Test
        public void testInstanceMethod() {
            Example example = new Example();
            int input = 5;
            int expected = 10;
            int result = example.doubleNumber(input);
            assertEquals(expected, result);
        }
    }