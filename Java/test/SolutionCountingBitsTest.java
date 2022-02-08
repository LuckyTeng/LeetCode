package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.SolutionCountingBits;

public class SolutionCountingBitsTest {
    @Test
    public void testCountBits() {
        var sol = new SolutionCountingBits();

        int n = 5;
        var actuals = sol.countBits(n);

        int[] expecteds = {0,1,1,2,1,2};

        assertArrayEquals(expecteds, actuals);
    }
}
