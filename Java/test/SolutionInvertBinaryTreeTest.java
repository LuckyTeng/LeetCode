package test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import src.SolutionInvertBinaryTree;
import src.TreeNode;

public class SolutionInvertBinaryTreeTest {
    @Test
    public void testInvertTree() {
        var sol = new SolutionInvertBinaryTree();

        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        root.left = node2;
        TreeNode node7 = new TreeNode(7);
        root.right = node7;
        TreeNode node1 = new TreeNode(1);
        root.left.left = node1;
        TreeNode node3 = new TreeNode(3);
        root.left.right = node3;
        TreeNode node6 = new TreeNode(6);
        root.right.left = node6;
        TreeNode node9 = new TreeNode(9);
        root.right.right = node9;

        var actual = sol.invertTree(root);

        assertSame(root, actual);
        assertSame(root.left, node7);
        assertSame(root.right, node2);
        assertSame(root.left.left, node9);
        assertSame(root.left.right, node6);
        assertSame(root.right.left, node3);
        assertSame(root.right.right, node1);
    }

    @Test
    public void testInvertTree1() {
        var sol = new SolutionInvertBinaryTree();

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        root.left = node1;
        TreeNode node3 = new TreeNode(3);
        root.right = node3;

        var actual = sol.invertTree(root);

        assertSame(root, actual);
        assertSame(root.left, node3);
        assertSame(root.right, node1);
    }

    @Test
    public void testInvertTree2() {
        var sol = new SolutionInvertBinaryTree();

        TreeNode root = null;

        var actual = sol.invertTree(root);

        assertNull(actual);
    }
}
