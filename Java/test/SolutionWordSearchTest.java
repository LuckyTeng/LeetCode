package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionWordSearch;

public class SolutionWordSearchTest {
    @Test
    public void testExist() {
        var s = new SolutionWordSearch();

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        
        var actual = s.exist(board, word);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testExist1() {
        var s = new SolutionWordSearch();

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        
        var actual = s.exist(board, word);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testExist2() {
        var s = new SolutionWordSearch();

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        
        var actual = s.exist(board, word);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
