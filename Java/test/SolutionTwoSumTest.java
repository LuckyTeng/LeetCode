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

    @Test
    public void testTwoSum2() {
        int[] nums = new int[] { -1, -2, -3, -4, -5 };
        int target = -8;

        SolutionTwoSum s = new SolutionTwoSum();
        
        var actuals = s.twoSum(nums, target);
        var aExpecteds = Arrays.asList(2,4);
        for (int i = 0; i < actuals.length; i++) {
            if ( !aExpecteds.contains(actuals[i]) )
                fail();
        }
    }

    @Test
    public void testTwoSum3() {
        int[] nums = new int[] { 0, 3, -3, 4, -1 };
        int target = -1;

        SolutionTwoSum s = new SolutionTwoSum();
        
        var actuals = s.twoSum(nums, target);
        var aExpecteds = Arrays.asList(0,4);
        for (int i = 0; i < actuals.length; i++) {
            if ( !aExpecteds.contains(actuals[i]) )
                fail();
        }
    }
}
