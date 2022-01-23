package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionValidateBinarySearchTree;
import src.SolutionValidateBinarySearchTree.TreeNode;

public class SolutionValidateBinarySearchTreeTest {
    @Test
    public void testIsValidBST() {
        var s = new SolutionValidateBinarySearchTree();

        TreeNode root = null;
        var actual = s.isValidBST(root);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidBST1() {
        var s = new SolutionValidateBinarySearchTree();

        TreeNode root = s.new TreeNode(2);
        root.left = s.new TreeNode(1);
        root.right = s.new TreeNode(3);
        var actual = s.isValidBST(root);
        
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testIsValidBST2() {
        var s = new SolutionValidateBinarySearchTree();

        TreeNode root = s.new TreeNode(5);
        root.left = s.new TreeNode(1);
        root.right = s.new TreeNode(4);
        root.right.left = s.new TreeNode(3);
        root.right.right = s.new TreeNode(6);
        var actual = s.isValidBST(root);
        
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
