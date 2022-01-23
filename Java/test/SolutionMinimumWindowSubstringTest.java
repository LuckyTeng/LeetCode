package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMinimumWindowSubstring;

public class SolutionMinimumWindowSubstringTest {
    @Test
    public void testMinWindow() {
        var solution = new SolutionMinimumWindowSubstring();

        String s = "DDBECODEBANC";
        String t = "ABC";
        var actual = solution.minWindow(s, t);

        String expected = "BANC";
        assertEquals(expected, actual);
    }

    @Test
    public void testMinWindow1() {
        var solution = new SolutionMinimumWindowSubstring();

        String s = "a";
        String t = "a";
        var actual = solution.minWindow(s, t);

        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    public void testMinWindow2() {
        var solution = new SolutionMinimumWindowSubstring();

        String s = "a";
        String t = "aa";
        var actual = solution.minWindow(s, t);

        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void testMinWindow3() {
        var solution = new SolutionMinimumWindowSubstring();

        String s = "ab";
        String t = "b";
        var actual = solution.minWindow(s, t);

        String expected = "b";
        assertEquals(expected, actual);
    }
}
