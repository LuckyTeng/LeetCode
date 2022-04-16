package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionRepeatedSubstringPattern;

public class SolutionRepeatedSubstringPatternTest {
    @Test
    public void testRepeatedSubstringPattern() {
        var sol = new SolutionRepeatedSubstringPattern();

        var s = "abab";
        var actual = sol.repeatedSubstringPattern(s);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testRepeatedSubstringPattern1() {
        var sol = new SolutionRepeatedSubstringPattern();

        var s = "aba";
        var actual = sol.repeatedSubstringPattern(s);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testRepeatedSubstringPattern2() {
        var sol = new SolutionRepeatedSubstringPattern();

        var s = "abcabcabcabc";
        var actual = sol.repeatedSubstringPattern(s);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
