package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMergeSortedArray;

public class SolutionMergeSortedArrayTest {
    @Test
    public void testMergeKLists() {
        SolutionMergeSortedArray s = new SolutionMergeSortedArray();

        SolutionMergeSortedArray.ListNode l1 = s.new ListNode(1);
        l1.next = s.new ListNode(4);
        l1.next.next = s.new ListNode(5);
        SolutionMergeSortedArray.ListNode l2 = s.new ListNode(1);
        l2.next = s.new ListNode(3);
        l2.next.next = s.new ListNode(4);
        SolutionMergeSortedArray.ListNode l3 = s.new ListNode(2);
        l3.next = s.new ListNode(6);

        SolutionMergeSortedArray.ListNode[] lists = new SolutionMergeSortedArray.ListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        var actual = s.mergeKLists(lists);
        int[] expected = new int[] { 1, 1, 2, 3, 4, 4, 5, 6 };
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual.val);
            actual = actual.next;
        }
    }
}
