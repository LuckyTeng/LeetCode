package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionTopKFrequentElements;

public class SolutionTopKFrequentElementsTest {
    @Test
    public void testTopKFrequent() {
        var sol = new SolutionTopKFrequentElements();

        int[] nums = {1,1,1,2,2,3,4,4,4,4};
        int k = 2;

        var actuals = sol.topKFrequent(nums, k);
        int[] expecteds = {1,2};

        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testTopKFrequent1() {
        var sol = new SolutionTopKFrequentElements();

        int[] nums = {1};
        int k = 1;

        var actuals = sol.topKFrequent(nums, k);
        int[] expecteds = {1};

        assertArrayEquals(expecteds, actuals);
    }
}
