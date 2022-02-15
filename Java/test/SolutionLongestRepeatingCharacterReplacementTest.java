package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionLongestRepeatingCharacterReplacement;

public class SolutionLongestRepeatingCharacterReplacementTest {
    @Test
    public void testCharacterReplacement() {
        var sol = new SolutionLongestRepeatingCharacterReplacement();

        String s = "ABAB";
        int k = 2;

        var actual = sol.characterReplacement(s, k);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterReplacement1() {
        var sol = new SolutionLongestRepeatingCharacterReplacement();

        String s = "AABABBA";
        int k = 1;

        var actual = sol.characterReplacement(s, k);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterReplacement2() {
        var sol = new SolutionLongestRepeatingCharacterReplacement();

        String s = "ABBBCCDDEEAAEDEDADEDABBEEDE";
        int k = 7;

        var actual = sol.characterReplacement(s, k);
        int expected = 12;

        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterReplacement3() {
        var sol = new SolutionLongestRepeatingCharacterReplacement();

        String s = "BRJRRKNRBFOOKDEEGODTGMHNABMTHFNPTFRHRSEKKTFEQIKSIAJJMSDSLNSCNRNJFNFSIQDNMHDRIJIACLCJKATTFHDASGLRQSFN";
        int k = 10;

        var actual = sol.characterReplacement(s, k);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterReplacement4() {
        var sol = new SolutionLongestRepeatingCharacterReplacement();

        String s = "ABAA";
        int k = 0;

        var actual = sol.characterReplacement(s, k);
        int expected = 2;

        assertEquals(expected, actual);
    }
}
