package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionLongestLineofConsecutiveOneinMatrix;

public class SolutionLongestLineofConsecutiveOneinMatrixTest {
    @Test
    public void testLongestLine() {
        var sol = new SolutionLongestLineofConsecutiveOneinMatrix();

        int[][] matrix = new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,1}};

        var actual = sol.longestLine(matrix);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testLongestLine2() {
        var sol = new SolutionLongestLineofConsecutiveOneinMatrix();

        int[][] matrix = new int[][]{{0,0},{1,1}};

        var actual = sol.longestLine(matrix);
        int expected = 2;

        assertEquals(expected, actual);
    }
}
