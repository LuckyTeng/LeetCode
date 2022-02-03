package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import src.ListNode;
import src.SolutionReverseLinkedList;

public class SolutionReverseLinkedListTest {

    @Test
    public void testReverseList() {
        var sol = new SolutionReverseLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        var actual = sol.reverseList(node1);

        assertEquals(node5, actual);
        actual = actual.next;
        assertEquals(node4, actual);
        actual = actual.next;
        assertEquals(node3, actual);
        actual = actual.next;
        assertEquals(node2, actual);
        actual = actual.next;
        assertEquals(node1, actual);
    }

    @Test
    public void testReverseList1() {
        var sol = new SolutionReverseLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        var actual = sol.reverseList(node1);

        assertEquals(node2, actual);
        actual = actual.next;
        assertEquals(node1, actual);
    }

    @Test
    public void testReverseList2() {
        var sol = new SolutionReverseLinkedList();
        
        var actual = sol.reverseList(null);

        assertNull(actual);
    }
}
