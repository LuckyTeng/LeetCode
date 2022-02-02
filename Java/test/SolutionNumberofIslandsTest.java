package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionNumberofIslands;

public class SolutionNumberofIslandsTest {
    @Test
    public void testNumIslands() {
        var sol = new SolutionNumberofIslands();

        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
          };

        var actual = sol.numIslands(grid);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testNumIslands1() {
        var sol = new SolutionNumberofIslands();

        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
          };

        var actual = sol.numIslands(grid);
        int expected = 3;

        assertEquals(expected, actual);
    }
}
