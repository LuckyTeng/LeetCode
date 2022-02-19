package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

import src.SolutionTwoSum;

public class SolutionTwoSumTest {
    @Test
    public void testTwoSum() {
        int[] nums = new int[] { 2, 7, 11, 5};
        int target = 9;

        SolutionTwoSum s = new SolutionTwoSum();
        
        var actuals = s.twoSum(nums, target);

        var aExpecteds = Arrays.asList(0,1);
        for (int i = 0; i < actuals.length; i++) {
            if ( !aExpecteds.contains(actuals[i]) )
                fail();
        }

    }

    @Test
    public void testTwoSum1() {
        int[] nums = new int[] { 3, 3 };
        int target = 6;

        SolutionTwoSum s = new SolutionTwoSum();
        
        var actuals = s.twoSum(nums, target);
        var aExpecteds = Arrays.asList(0,1);
        for (int i = 0; i < actuals.length; i++) {
            if ( !aExpecteds.contains(actuals[i]) )
                fail();
        }
    }
}
