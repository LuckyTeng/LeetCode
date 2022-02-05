package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionProductofArrayExceptSelf;

public class SolutionProductofArrayExceptSelfTest {
    @Test
    public void testProductExceptSelf() {
        var sol = new SolutionProductofArrayExceptSelf();

        int[] nums = {1,2,3,4};

        var actuals = sol.productExceptSelf(nums);
        int[] expecteds = {24,12,8,6};

        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testProductExceptSelf1() {
        var sol = new SolutionProductofArrayExceptSelf();

        int[] nums = {-1,1,0,-3,3};

        var actuals = sol.productExceptSelf(nums);
        int[] expecteds = {0,0,9,0,0};

        assertArrayEquals(expecteds, actuals);
    }
}
