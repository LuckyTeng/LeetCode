package src;

@LeetCodeInformation(Number = 206, Url = "https://leetcode.com/problems/reverse-linked-list/")
public class SolutionReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverseListRecur(head);
    }

    private ListNode reverseListRecur(ListNode head) {
        if ( head == null || head.next == null ) return head;

        ListNode n = reverseListRecur(head.next);

        head.next.next = head;
        head.next = null;

        return n;
    }
}
