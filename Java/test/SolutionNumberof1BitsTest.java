package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionNumberof1Bits;

public class SolutionNumberof1BitsTest {
    @Test
    public void testHammingWeight() {
        var sol = new SolutionNumberof1Bits();

        int n = 0b1011;
        
        var actual = sol.hammingWeight(n);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testHammingWeight1() {
        var sol = new SolutionNumberof1Bits();

        int n = 0b10000000;
        
        var actual = sol.hammingWeight(n);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testHammingWeight2() {
        var sol = new SolutionNumberof1Bits();

        int n = 0b11111111101111111111111111111111;
        
        var actual = sol.hammingWeight(n);
        int expected = 31;

        assertEquals(expected, actual);
    }
}
