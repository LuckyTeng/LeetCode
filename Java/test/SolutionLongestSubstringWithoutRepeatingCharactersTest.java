package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionLongestSubstringWithoutRepeatingCharacters;

public class SolutionLongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLengthOfLongestSubstring() {
        SolutionLongestSubstringWithoutRepeatingCharacters s = new SolutionLongestSubstringWithoutRepeatingCharacters();

        String input = "abcabcbb";
        var actual = s.LengthOfLongestSubstring(input);
        assertEquals(actual, 3);
    }

    @Test
    public void testLengthOfLongestSubstring1() {
        SolutionLongestSubstringWithoutRepeatingCharacters s = new SolutionLongestSubstringWithoutRepeatingCharacters();

        String input = "bbbbb";
        var actual = s.LengthOfLongestSubstring(input);
        assertEquals(actual, 1);
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        SolutionLongestSubstringWithoutRepeatingCharacters s = new SolutionLongestSubstringWithoutRepeatingCharacters();

        String input = "pwwkew";
        var actual = s.LengthOfLongestSubstring(input);
        assertEquals(actual, 3);
    }
}
