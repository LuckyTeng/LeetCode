package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionTwoSum;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        int[] nums = new int[] { 2, 7, 11, 5};
        int target = 9;

        SolutionTwoSum s = new SolutionTwoSum();
        
        var actuals = s.twoSum(nums, target);
        int[] expecteds = new int[] { 0, 1 };
        assertArrayEquals(expecteds, actuals);
    }
}
