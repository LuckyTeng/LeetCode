package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionInsertInterval;

public class SolutionInsertIntervalTest {
    @Test
    public void testInsert() {
        var s = new SolutionInsertInterval();

        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        var actuals = s.insert(intervals, newInterval);

        int[][] expecteds = {{1,5},{6,9}};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testInsert2() {
        var s = new SolutionInsertInterval();

        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        var actuals = s.insert(intervals, newInterval);

        int[][] expecteds = {{1,2},{3,10},{12,16}};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testInsert3() {
        var s = new SolutionInsertInterval();

        int[][] intervals = {};
        int[] newInterval = {4,8};
        var actuals = s.insert(intervals, newInterval);

        int[][] expecteds = {{4,8}};
        assertArrayEquals(expecteds, actuals);
    }
}
