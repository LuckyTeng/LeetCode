package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionSetMatrixZeroes;

public class SolutionSetMatrixZeroesTest {
    @Test
    public void testSetZeroes() {
        var s = new SolutionSetMatrixZeroes();

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        s.setZeroes(matrix);

        int[][] expecteds = {{1,0,1},{0,0,0},{1,0,1}};
        assertArrayEquals(expecteds, matrix);
    }

    @Test
    public void testSetZeroes1() {
        var s = new SolutionSetMatrixZeroes();

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        s.setZeroes(matrix);

        int[][] expecteds = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        assertArrayEquals(expecteds, matrix);
    }

    @Test
    public void testSetZeroes2() {
        var s = new SolutionSetMatrixZeroes();

        int[][] matrix = {{1},{0}};
        s.setZeroes(matrix);

        int[][] expecteds = {{0},{0}};
        assertArrayEquals(expecteds, matrix);
    }
}
