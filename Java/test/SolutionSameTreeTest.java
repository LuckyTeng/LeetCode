package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionSameTree;
import src.TreeNode;

public class SolutionSameTreeTest {
    @Test
    public void testIsSameTree() {
        var s = new SolutionSameTree();

        TreeNode p = new TreeNode(2);
        p.left = new TreeNode(1);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(2);
        q.left = new TreeNode(1);
        q.right = new TreeNode(3);

        var actual = s.isSameTree(p, q);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
