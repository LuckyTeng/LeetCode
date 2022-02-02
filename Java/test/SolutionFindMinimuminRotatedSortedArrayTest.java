package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionFindMinimuminRotatedSortedArray;

public class SolutionFindMinimuminRotatedSortedArrayTest {
    @Test
    public void testFindMin() {
        var sol = new SolutionFindMinimuminRotatedSortedArray();

        int[] nums = {3, 4, 5, 1, 2};

        var actual = sol.findMin(nums);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testFindMin1() {
        var sol = new SolutionFindMinimuminRotatedSortedArray();

        int[] nums = {4,5,6,7,0,1,2};

        var actual = sol.findMin(nums);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testFindMin2() {
        var sol = new SolutionFindMinimuminRotatedSortedArray();

        int[] nums = {11,13,15,17};

        var actual = sol.findMin(nums);
        int expected = 11;

        assertEquals(expected, actual);
    }
}
