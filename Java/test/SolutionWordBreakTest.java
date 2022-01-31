package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import src.SolutionWordBreak;

public class SolutionWordBreakTest {
    @Test
    public void testWordBreak() {
        var s = new SolutionWordBreak();

        String input = "leetcode";
        List<String> wordDict = Arrays.asList(new String[] {"leet", "code"});

        var actual = s.wordBreak(input, wordDict);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testWordBreak1() {
        var s = new SolutionWordBreak();

        String input = "applepenapple";
        List<String> wordDict = Arrays.asList(new String[] {"apple", "pen"});

        var actual = s.wordBreak(input, wordDict);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testWordBreak2() {
        var s = new SolutionWordBreak();

        String input = "catsandog";
        List<String> wordDict = Arrays.asList(new String[] {"cats", "dog", "sand", "and", "cat"});

        var actual = s.wordBreak(input, wordDict);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
