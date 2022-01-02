package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionLongestPalindromicSubstring;

public class SolutionLongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindrome() {
        SolutionLongestPalindromicSubstring s = new SolutionLongestPalindromicSubstring();
        
        String input = "babad";

        var actual = s.longestPalindrome(input);
        assertEquals("aba", actual);
    }
}
