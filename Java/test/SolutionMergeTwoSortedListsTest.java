package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMergeTwoSortedLists;
import src.SolutionMergeTwoSortedLists.ListNode;

public class SolutionMergeTwoSortedListsTest {
    @Test
    public void testMergeTwoLists() {
        SolutionMergeTwoSortedLists s = new SolutionMergeTwoSortedLists();

        ListNode l1 = null;
        ListNode l2 = null;
        var actual = s.MergeTwoLists(l1, l2);

        assertEquals(null, actual);
    }

    @Test
    public void testMergeTwoLists2() {
        SolutionMergeTwoSortedLists s = new SolutionMergeTwoSortedLists();

        ListNode l1 = null;
        ListNode l2 = s.new ListNode(0);
        var actual = s.MergeTwoLists(l1, l2);

        assertEquals(0, actual.val);
    }

    @Test
    public void testMergeTwoLists3() {
        SolutionMergeTwoSortedLists s = new SolutionMergeTwoSortedLists();

        ListNode l1 = s.new ListNode(1);
        l1.next = s.new ListNode(2);
        l1.next.next = s.new ListNode(4);
        ListNode l2 = s.new ListNode(1);
        l2.next = s.new ListNode(3);
        l2.next.next = s.new ListNode(4);
        var actual = s.MergeTwoLists(l1, l2);

        int[] expected = new int[] { 1, 1, 2, 3, 4, 4};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual.val);
            actual = actual.next;
        }
       
    }
}
