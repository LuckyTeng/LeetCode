package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionSearchinRotatedSortedArray;

public class SolutionSearchinRotatedSortedArrayTest {
    @Test
    public void testSearch() {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        SolutionSearchinRotatedSortedArray s = new SolutionSearchinRotatedSortedArray();

        var actual = s.search(nums, target);

        assertEquals(4, actual);
    }
}
