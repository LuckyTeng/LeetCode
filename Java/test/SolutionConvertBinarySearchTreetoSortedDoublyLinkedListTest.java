package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionConvertBinarySearchTreetoSortedDoublyLinkedList;
import src.TreeNode;

public class SolutionConvertBinarySearchTreetoSortedDoublyLinkedListTest {
    @Test
    public void testTreeToDoublyList() {
        var sol = new SolutionConvertBinarySearchTreetoSortedDoublyLinkedList();

        TreeNode root = CommonHelper.BuildTree(new Integer[]{4,2,5,1,3});

        var actual = sol.treeToDoublyList(root);

        assertEquals(actual.val, 1);
        actual = actual.right;
        assertEquals(actual.val, 2);
        actual = actual.right;
        assertEquals(actual.val, 3);
        actual = actual.right;
        assertEquals(actual.val, 4);
        actual = actual.right;
        assertEquals(actual.val, 5);
        actual = actual.right;
    }

    @Test
    public void testTreeToDoublyList2() {
        var sol = new SolutionConvertBinarySearchTreetoSortedDoublyLinkedList();

        TreeNode root = null;
        var actual = sol.treeToDoublyList(root);

        assertNull(actual);
    }

    @Test
    public void testTreeToDoublyList3() {
        var sol = new SolutionConvertBinarySearchTreetoSortedDoublyLinkedList();

        TreeNode root = new TreeNode(1);
        var actual = sol.treeToDoublyList(root);

        assertEquals(actual.val, 1);
        assertEquals(actual.left.val, actual.right.val);
    }
}
