package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionFindLargestValueinEachTreeRow;

public class SolutionFindLargestValueinEachTreeRowTest {
    @Test
    public void testLargestValues() {
        var sol = new SolutionFindLargestValueinEachTreeRow();

        var root = CommonHelper.BuildTree(new Integer[] { 1,3,2,5,3,null,9});
        
        var actuals = sol.largestValues(root);
        Integer[] expecteds = new Integer[] {1,3,9};
        
        assertArrayEquals(expecteds, actuals.toArray(new Integer[]{0}));
    }

    @Test
    public void testLargestValues1() {
        var sol = new SolutionFindLargestValueinEachTreeRow();

        var root = CommonHelper.BuildTree(new Integer[] { 1,2,3 });
        
        var actuals = sol.largestValues(root);
        Integer[] expecteds = new Integer[] {1,3};
        
        assertArrayEquals(expecteds, actuals.toArray(new Integer[]{0}));
    }
}
