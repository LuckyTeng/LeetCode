package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionFindMedianfromDataStream;

public class SolutionFindMedianfromDataStream$MedianFinderTest {
    @Test
    public void testMedianFinder() {
        var sol = new SolutionFindMedianfromDataStream();

        var finder = sol.new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        finder.findMedian();
        finder.addNum(3);

        var actual = finder.findMedian();
        double expected = 2;
        assertEquals(expected, actual, 1e-7);
    }
}
