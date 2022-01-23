package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import src.SolutionBinaryTreeLevelOrderTraversal;
import src.SolutionBinaryTreeLevelOrderTraversal.TreeNode;

public class SolutionBinaryTreeLevelOrderTraversalTest {
    @Test
    public void testLevelOrder() {
        var s = new SolutionBinaryTreeLevelOrderTraversal();

        TreeNode root = s.new TreeNode(3);
        root.left = s.new TreeNode(9);
        root.right = s.new TreeNode(20);
        root.right.left = s.new TreeNode(15);
        root.right.right = s.new TreeNode(7);
        var actuals = s.levelOrder(root);

        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(new Integer[]{3}));
        expecteds.add(Arrays.asList(new Integer[]{9,20}));
        expecteds.add(Arrays.asList(new Integer[]{15,7}));

        assertArrayEquals(expecteds.toArray(), actuals.toArray());
    }

    @Test
    public void testLevelOrder1() {
        var s = new SolutionBinaryTreeLevelOrderTraversal();

        TreeNode root = s.new TreeNode(1);
        var actuals = s.levelOrder(root);

        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(new Integer[]{1}));

        assertArrayEquals(expecteds.toArray(), actuals.toArray());
    }

    @Test
    public void testLevelOrder2() {
        var s = new SolutionBinaryTreeLevelOrderTraversal();

        TreeNode root = null;
        var actuals = s.levelOrder(root);

        List<List<Integer>> expecteds = new ArrayList<>();

        assertArrayEquals(expecteds.toArray(), actuals.toArray());
    }
}
