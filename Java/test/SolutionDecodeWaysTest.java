package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionDecodeWays;

public class SolutionDecodeWaysTest {
    @Test
    public void testNumDecodings() {
        var solv = new SolutionDecodeWays();

        
        String s = "12";
        var actual = solv.numDecodings(s);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testNumDecodings1() {
        var solv = new SolutionDecodeWays();

        
        String s = "226";
        var actual = solv.numDecodings(s);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testNumDecodings2() {
        var solv = new SolutionDecodeWays();

        
        String s = "06";
        var actual = solv.numDecodings(s);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
