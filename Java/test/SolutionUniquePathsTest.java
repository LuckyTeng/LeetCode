package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionUniquePaths;

public class SolutionUniquePathsTest {
    @Test
    public void testUniquePaths() {
        var s = new SolutionUniquePaths();

        int m = 3;
        int n = 7;
        int actual = s.uniquePaths(m, n);
        int expected = 28;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testUniquePaths1() {
        var s = new SolutionUniquePaths();

        int m = 3;
        int n = 2;
        int actual = s.uniquePaths(m, n);
        int expected = 3;
        
        assertEquals(expected, actual);
    }
}
