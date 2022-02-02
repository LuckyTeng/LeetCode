package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionReverseBits;

public class SolutionReverseBitsTest {
    @Test
    public void testReverseBits() {
        var sol = new SolutionReverseBits();

        int n = 43261596;
        var actual = sol.reverseBits(n);
        int expected = 964176192;

        assertEquals(expected, actual);
    }

    @Test
    public void testReverseBits1() {
        var sol = new SolutionReverseBits();

        int n = 0xFFFFFFFD;
        var actual = sol.reverseBits(n);
        int expected = 0xBFFFFFFF;

        assertEquals(expected, actual);
    }
}
