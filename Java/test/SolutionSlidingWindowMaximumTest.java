package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionSlidingWindowMaximum;

public class SolutionSlidingWindowMaximumTest {
    @Test
    public void testMaxSlidingWindow() {
        var sol = new SolutionSlidingWindowMaximum();

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        var actuals = sol.maxSlidingWindow(nums, k);
        int[] expecteds = {3,3,5,5,6,7};

        assertArrayEquals(expecteds, actuals);
    }
}
