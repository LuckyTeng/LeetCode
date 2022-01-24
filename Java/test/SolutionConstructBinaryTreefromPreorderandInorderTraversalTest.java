package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.SolutionConstructBinaryTreefromPreorderandInorderTraversal;
import src.SolutionSameTree;
import src.TreeNode;

public class SolutionConstructBinaryTreefromPreorderandInorderTraversalTest {
    @Test
    public void testBuildTree() {
        var s = new SolutionConstructBinaryTreefromPreorderandInorderTraversal();

        int[] preorder = {3, 9, 1, 2, 20, 15, 7};
        int[] inorder = {1, 9, 2, 3, 15, 20, 7};
        var actual = s.buildTree(preorder, inorder);
        var expected = new TreeNode(3);
        expected.left = new TreeNode(9);
        expected.left.left = new TreeNode(1);
        expected.left.right = new TreeNode(2);
        expected.right = new TreeNode(20);
        expected.right.left = new TreeNode(15);
        expected.right.right = new TreeNode(7);

        SolutionSameTree sst = new SolutionSameTree();

        var result = sst.isSameTree(expected, actual);

        assertEquals(true, result);
    }

    @Test
    public void testBuildTree1() {
        var s = new SolutionConstructBinaryTreefromPreorderandInorderTraversal();

        int[] preorder = {-1};
        int[] inorder = {-1};
        var actual = s.buildTree(preorder, inorder);
        var expected = new TreeNode(-1);

        SolutionSameTree sst = new SolutionSameTree();

        var result = sst.isSameTree(expected, actual);

        assertEquals(true, result);
    }
}
