package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMedianofTwoSortedArrays;

public class SolutionMedianofTwoSortedArraysTest {
    @Test
    public void testFindMedianSortedArrays() {
        var sol = new SolutionMedianofTwoSortedArrays();

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        var actual = sol.findMedianSortedArrays(nums1, nums2);
        double expected = 2;

        assertEquals(expected, actual, 1e-7);
    }

    @Test
    public void testFindMedianSortedArrays1() {
        var sol = new SolutionMedianofTwoSortedArrays();

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        var actual = sol.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5;

        assertEquals(expected, actual, 1e-7);
    }
}
