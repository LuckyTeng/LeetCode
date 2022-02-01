package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import src.ListNode;
import src.SolutionLinkedListCycle;

public class SolutionLinkedListCycleTest {
    @Test
    public void testHasCycle() {
        ListNode head = new ListNode(3);
        ListNode node2 = head.next = new ListNode(2);
        node2.next = new ListNode(0);
        ListNode node4 = node2.next.next = new ListNode(-4);
        node4.next = node2;

        var s = new SolutionLinkedListCycle();

        var actual = s.hasCycle(head);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testHasCycle1() {
        ListNode head = new ListNode(1);
        ListNode node2 = head.next = new ListNode(2);
        node2.next = head;

        var s = new SolutionLinkedListCycle();

        var actual = s.hasCycle(head);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testHasCycle2() {
        ListNode head = new ListNode(1);

        var s = new SolutionLinkedListCycle();

        var actual = s.hasCycle(head);
        boolean expected = false;

        assertEquals(expected, actual);
    }
    
}
