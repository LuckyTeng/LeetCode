package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionMergeIntervals;

public class SolutionMergeIntervalsTest {
    @Test
    public void testMerge() {
        var s = new SolutionMergeIntervals();

        int[][] intervals = {{1,3}, {2,6},{8,10},{15,18}};
        var actual = s.merge(intervals);

        int[][] expected = {{1,6}, {8,10}, {15,18}};

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testMerge1() {
        var s = new SolutionMergeIntervals();

        int[][] intervals = {{1,4}, {2,3}};
        var actual = s.merge(intervals);

        int[][] expected = {{1,4}};

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}
