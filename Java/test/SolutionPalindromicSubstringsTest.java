package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionPalindromicSubstrings;

public class SolutionPalindromicSubstringsTest {
    @Test
    public void testCountSubstrings() {
        var sol = new SolutionPalindromicSubstrings();

        String s = "abc";

        var actual = sol.countSubstrings(s);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountSubstrings1() {
        var sol = new SolutionPalindromicSubstrings();

        String s = "aaa";

        var actual = sol.countSubstrings(s);
        int expected = 6;

        assertEquals(expected, actual);
    }
}
