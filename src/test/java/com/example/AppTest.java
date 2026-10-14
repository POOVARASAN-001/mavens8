package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testStandardFactorial() {
        App app = new App();
        assertEquals(120, app.calculateFactorial(5));
        assertEquals(24, app.calculateFactorial(4));
    }

    @Test
    public void testFactorialOfZeroAndOne() {
        App app = new App();
        assertEquals(1, app.calculateFactorial(0));
        assertEquals(1, app.calculateFactorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumberException() {
        App app = new App();
        app.calculateFactorial(-5);
    }
}
