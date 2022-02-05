package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionValidAnagram;

public class SolutionValidAnagramTest {
    @Test
    public void testIsAnagram() {
        var sol = new SolutionValidAnagram();

        String s = "anagram";
        String t = "nagaram";
        var actual = sol.isAnagram(s, t);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsAnagram1() {
        var sol = new SolutionValidAnagram();

        String s = "rat";
        String t = "car";
        var actual = sol.isAnagram(s, t);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
