package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.ListNode;
import src.SolutionLinkedListCycle;
import src.SolutionReorderList;

public class SolutionReorderListTest {
    @Test
    public void testReorderList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        var s = new SolutionReorderList();

        s.reorderList(node1);

        var expected = node1;
        assertEquals(expected.val, 1);
        expected = expected.next;
        assertEquals(expected.val, 4);
        expected = expected.next;
        assertEquals(expected.val, 2);
        expected = expected.next;
        assertEquals(expected.val, 3);
    }

    @Test
    public void testReorderList1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        var s = new SolutionReorderList();

        s.reorderList(node1);

        var expected = node1;
        assertEquals(expected.val, 1);
        expected = expected.next;
        assertEquals(expected.val, 5);
        expected = expected.next;
        assertEquals(expected.val, 2);
        expected = expected.next;
        assertEquals(expected.val, 4);
        expected = expected.next;
        assertEquals(expected.val, 3);

        var cycleTest = new SolutionLinkedListCycle();
        var actual = cycleTest.hasCycle(node1);
        assertEquals(false, actual);
    }

    @Test
    public void testReorderList2() {
        ListNode node1 = new ListNode(1);
        
        var s = new SolutionReorderList();

        s.reorderList(node1);

        var expected = node1;
        assertEquals(expected.val, 1);
    }

    @Test
    public void testReorderList3() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        node1.next = node2;

        var s = new SolutionReorderList();

        s.reorderList(node1);

        var expected = node1;
        assertEquals(expected.val, 1);
        expected = expected.next;
        assertEquals(expected.val, 2);
    }
}
