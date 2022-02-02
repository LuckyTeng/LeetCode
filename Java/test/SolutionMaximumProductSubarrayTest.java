package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMaximumProductSubarray;

public class SolutionMaximumProductSubarrayTest {
    @Test
    public void testMaxProduct() {
        var sol = new SolutionMaximumProductSubarray();

        int[] nums = {2, 3, -2, 4};
        var actual = sol.maxProduct(nums);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxProduct1() {
        var sol = new SolutionMaximumProductSubarray();

        int[] nums = {-2,0,-1};
        var actual = sol.maxProduct(nums);

        int expected = 0;

        assertEquals(expected, actual);
    }
}
