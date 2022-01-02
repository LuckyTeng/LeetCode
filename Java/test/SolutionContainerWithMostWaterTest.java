package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionContainerWithMostWater;

public class SolutionContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        SolutionContainerWithMostWater s = new SolutionContainerWithMostWater();
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        var actual = s.maxArea(height);

        assertEquals(49, actual);
    }
}
