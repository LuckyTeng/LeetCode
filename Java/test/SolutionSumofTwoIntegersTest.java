package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionSumofTwoIntegers;

public class SolutionSumofTwoIntegersTest {
    @Test
    public void testGetSum() {
        var sol = new SolutionSumofTwoIntegers();

        int a = 1, b = 2;

        var actual = sol.getSum(a, b);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSum1() {
        var sol = new SolutionSumofTwoIntegers();

        int a = 132, b = 327;

        var actual = sol.getSum(a, b);
        int expected = 459;

        assertEquals(expected, actual);
    }
}
