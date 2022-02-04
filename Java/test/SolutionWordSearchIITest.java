package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import src.SolutionWordSearchII;

public class SolutionWordSearchIITest {
    @Test
    public void testFindWords() {
        var s = new SolutionWordSearchII();

        char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        var actuals = s.findWords(board, words);

        String[] expecteds = {"oath", "eat"};

        assertEquals(expecteds.length, actuals.size());

        for (int i = 0; i < expecteds.length; i++) {
            if ( !actuals.contains(expecteds[i]))
                fail();
        }
    }

    @Test
    public void testFindWords1() {
        var s = new SolutionWordSearchII();

        char[][] board = {{'a','b'},{'c','d'}};
        String[] words = {"abcb"};
        var actuals = s.findWords(board, words);

        String[] expecteds = {};

        assertEquals(expecteds.length, actuals.size());

        for (int i = 0; i < expecteds.length; i++) {
            if ( !actuals.contains(expecteds[i]))
                fail();
        }
    }
}
