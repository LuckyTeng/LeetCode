package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionBinaryTreeMaximumPathSum;
import src.TreeNode;

public class SolutionBinaryTreeMaximumPathSumTest {
    @Test
    public void testMaxPathSum() {
        var s = new SolutionBinaryTreeMaximumPathSum();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        var actual = s.maxPathSum(root);
        
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxPathSum1() {
        var s = new SolutionBinaryTreeMaximumPathSum();
        
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        var actual = s.maxPathSum(root);
        
        int expected = 42;

        assertEquals(expected, actual);
    }
}
