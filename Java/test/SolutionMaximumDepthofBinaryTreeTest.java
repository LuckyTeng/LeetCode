package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMaximumDepthofBinaryTree;
import src.SolutionMaximumDepthofBinaryTree.TreeNode;

public class SolutionMaximumDepthofBinaryTreeTest {
    @Test
    public void testMaxDepth() {
        var s = new SolutionMaximumDepthofBinaryTree();

        TreeNode root = s.new TreeNode(3);
        root.left = s.new TreeNode(9);
        root.right = s.new TreeNode(20);
        root.right.left = s.new TreeNode(15);
        root.right.right = s.new TreeNode(7);
        var actual = s.maxDepth(root);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDepth1() {
        var s = new SolutionMaximumDepthofBinaryTree();

        TreeNode root = s.new TreeNode(1);
        root.right = s.new TreeNode(2);
        var actual = s.maxDepth(root);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDepth2() {
        var s = new SolutionMaximumDepthofBinaryTree();

        TreeNode root = s.new TreeNode(3);
        root.left = s.new TreeNode(9);
        root.right = s.new TreeNode(20);
        root.right.left = s.new TreeNode(15);
        root.right.right = s.new TreeNode(7);
        root.right.right.right = s.new TreeNode(21);
        var actual = s.maxDepth(root);

        int expected = 4;

        assertEquals(expected, actual);
    }
}
