package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionKthSmallestElementinaBST;
import src.TreeNode;

public class SolutionKthSmallestElementinaBSTTest {
    @Test
    public void testKthSmallest() {
        var sol = new SolutionKthSmallestElementinaBST();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;
        var actual = sol.kthSmallest(root, k);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testKthSmallest1() {
        var sol = new SolutionKthSmallestElementinaBST();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        int k = 3;
        var actual = sol.kthSmallest(root, k);

        int expected = 3;

        assertEquals(expected, actual);
    }
}
