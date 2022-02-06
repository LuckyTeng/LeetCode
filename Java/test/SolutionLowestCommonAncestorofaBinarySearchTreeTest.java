package test;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionLowestCommonAncestorofaBinarySearchTree;
import src.TreeNode;

public class SolutionLowestCommonAncestorofaBinarySearchTreeTest {
    @Test
    public void testLowestCommonAncestor() {
        var sol = new SolutionLowestCommonAncestorofaBinarySearchTree();

        Integer[] tree = {6,2,8,0,4,7,9,null,null,3,5};

        TreeNode root = CommonHelper.BuildTree(tree);

        TreeNode p = root.left;
        TreeNode q = root.right;
        var actual = sol.lowestCommonAncestor(root, p, q);
        
        assertSame(root, actual);
    }

    @Test
    public void testLowestCommonAncestor1() {
        var sol = new SolutionLowestCommonAncestorofaBinarySearchTree();

        Integer[] tree = {6,2,8,0,4,7,9,null,null,3,5};

        TreeNode root = CommonHelper.BuildTree(tree);

        TreeNode p = root.left;
        TreeNode q = root.left.right;
        var actual = sol.lowestCommonAncestor(root, p, q);
        
        assertSame(root.left, actual);
    }

    @Test
    public void testLowestCommonAncestor2() {
        var sol = new SolutionLowestCommonAncestorofaBinarySearchTree();

        Integer[] tree = {2,1};

        TreeNode root = CommonHelper.BuildTree(tree);

        TreeNode p = root;
        TreeNode q = root.left;
        var actual = sol.lowestCommonAncestor(root, p, q);
        
        assertSame(root, actual);
    }
}
