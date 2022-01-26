package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionValidPalindrome;

public class SolutionValidPalindromeTest {
    @Test
    public void testIsPalindrome() {
        String input = "A man, a plan, a canal: Panama";

        var s = new SolutionValidPalindrome();

        var actual = s.isPalindrome(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome1() {
        String input = "race a car";

        var s = new SolutionValidPalindrome();

        var actual = s.isPalindrome(input);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome2() {
        String input = " ";

        var s = new SolutionValidPalindrome();

        var actual = s.isPalindrome(input);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
