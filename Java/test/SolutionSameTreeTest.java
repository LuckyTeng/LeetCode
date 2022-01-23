package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionSameTree;
import src.SolutionSameTree.TreeNode;

public class SolutionSameTreeTest {
    @Test
    public void testIsSameTree() {
        var s = new SolutionSameTree();

        TreeNode p = s.new TreeNode(2);
        p.left = s.new TreeNode(1);
        p.right = s.new TreeNode(3);

        TreeNode q = s.new TreeNode(2);
        q.left = s.new TreeNode(1);
        q.right = s.new TreeNode(3);

        var actual = s.isSameTree(p, q);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
