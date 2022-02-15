package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionNonOverlappingIntervals;

public class SolutionNonOverlappingIntervalsTest {
    @Test
    public void testEraseOverlapIntervals() {
        var sol = new SolutionNonOverlappingIntervals();

        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        var actual = sol.eraseOverlapIntervals(intervals);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testEraseOverlapIntervals1() {
        var sol = new SolutionNonOverlappingIntervals();

        int[][] intervals = {{1,2},{1,2},{1,2}};

        var actual = sol.eraseOverlapIntervals(intervals);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testEraseOverlapIntervals2() {
        var sol = new SolutionNonOverlappingIntervals();

        int[][] intervals = {{1,2},{2,3}};

        var actual = sol.eraseOverlapIntervals(intervals);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testEraseOverlapIntervals3() {
        var sol = new SolutionNonOverlappingIntervals();

        int[][] intervals = {{1,100},{11,22},{1,11},{2,12}};

        var actual = sol.eraseOverlapIntervals(intervals);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testEraseOverlapIntervals4() {
        var sol = new SolutionNonOverlappingIntervals();

        int[][] intervals = {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};

        var actual = sol.eraseOverlapIntervals(intervals);
        int expected = 7;

        assertEquals(expected, actual);
    }
}
