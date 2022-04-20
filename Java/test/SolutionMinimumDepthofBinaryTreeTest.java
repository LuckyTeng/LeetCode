package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionMinimumDepthofBinaryTree;

public class SolutionMinimumDepthofBinaryTreeTest {
    @Test
    public void testMinDepth() {
        var sol = new SolutionMinimumDepthofBinaryTree();

        var root = CommonHelper.BuildTree(new Integer[] {3,9,20,null,null,15,7});

        var actual = sol.minDepth(root);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testMinDepth1() {
        var sol = new SolutionMinimumDepthofBinaryTree();

        var root = CommonHelper.BuildTree(new Integer[] {2,null,3,null,4,null,5,null,6});

        var actual = sol.minDepth(root);
        int expected = 5;

        assertEquals(expected, actual);
    }
}
