package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionCuttingRibbons;

public class SolutionCuttingRibbonsTest {
    @Test
    public void testMaxLength() {
        var sol = new SolutionCuttingRibbons();

        int[] ribbons = new int[]{7, 9, 5};
        var actual = sol.maxLength(ribbons, 3);

        int expected = 5;

        assertEquals(expected, actual);
    }
}
