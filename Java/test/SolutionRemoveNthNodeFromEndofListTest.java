package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionRemoveNthNodeFromEndofList;

public class SolutionRemoveNthNodeFromEndofListTest {
    @Test
    public void testRemoveNthFromEnd() {
        SolutionRemoveNthNodeFromEndofList s = new SolutionRemoveNthNodeFromEndofList();

        SolutionRemoveNthNodeFromEndofList.ListNode temp = null;
        SolutionRemoveNthNodeFromEndofList.ListNode head = s.new ListNode(1);
        temp = head;
        temp.next = s.new ListNode(2); temp = temp.next;
        temp.next = s.new ListNode(3); temp = temp.next;
        temp.next = s.new ListNode(4); temp = temp.next;
        temp.next = s.new ListNode(5); temp = temp.next;

        var actual = s.removeNthFromEnd(head, 2);

        SolutionRemoveNthNodeFromEndofList.ListNode expectHead = s.new ListNode(1);
        temp = expectHead;
        temp.next = s.new ListNode(2); temp = temp.next;
        temp.next = s.new ListNode(3); temp = temp.next;
        temp.next = s.new ListNode(5); temp = temp.next;

        do {
            assertEquals(expectHead.val, actual.val);
            expectHead = expectHead.next;
            actual = actual.next;
        } while( expectHead != null ||  actual != null );
    }

    @Test
    public void testRemoveNthFromEnd2() {
        SolutionRemoveNthNodeFromEndofList s = new SolutionRemoveNthNodeFromEndofList();

        SolutionRemoveNthNodeFromEndofList.ListNode temp = null;
        SolutionRemoveNthNodeFromEndofList.ListNode head = s.new ListNode(1);
        temp = head;
        temp.next = s.new ListNode(2); temp = temp.next;
        temp.next = s.new ListNode(3); temp = temp.next;
        temp.next = s.new ListNode(4); temp = temp.next;
        temp.next = s.new ListNode(5); temp = temp.next;

        var actual = s.removeNthFromEnd(head, 5);

        SolutionRemoveNthNodeFromEndofList.ListNode expectHead = s.new ListNode(2);
        temp = expectHead;
        temp.next = s.new ListNode(3); temp = temp.next;
        temp.next = s.new ListNode(4); temp = temp.next;
        temp.next = s.new ListNode(5); temp = temp.next;

        do {
            assertEquals(expectHead.val, actual.val);
            expectHead = expectHead.next;
            actual = actual.next;
        } while( expectHead != null ||  actual != null );
    }
}
