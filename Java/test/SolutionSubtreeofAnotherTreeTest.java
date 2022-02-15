package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionSubtreeofAnotherTree;

public class SolutionSubtreeofAnotherTreeTest {
    @Test
    public void testIsSubtree() {
        var sol = new SolutionSubtreeofAnotherTree();

        var root = CommonHelper.BuildTree(new Integer[] {3,4,5,1,2});
        var subRoot = CommonHelper.BuildTree(new Integer[] {4,1,2});

        var actual = sol.isSubtree(root, subRoot);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsSubtree1() {
        var sol = new SolutionSubtreeofAnotherTree();

        var root = CommonHelper.BuildTree(new Integer[] {3,4,5,1,2,null,null,null,null,0});
        var subRoot = CommonHelper.BuildTree(new Integer[] {4,1,2});

        var actual = sol.isSubtree(root, subRoot);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsSubtree2() {
        var sol = new SolutionSubtreeofAnotherTree();

        var root = CommonHelper.BuildTree(new Integer[] {1,1});
        var subRoot = CommonHelper.BuildTree(new Integer[] {1});

        var actual = sol.isSubtree(root, subRoot);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
