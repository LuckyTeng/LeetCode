package src;

@LeetCodeInformation(Number = 21, Url = "https://leetcode.com/problems/merge-two-sorted-lists/")
public class SolutionMergeTwoSortedLists {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode MergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;

        while ( l1 != null || l2 != null)
        {
            if ( l1 != null && l2 != null ){
                if ( l1.val < l2.val ) {
                    curr.next = new ListNode(l1.val);
                    curr = curr.next;
                    l1 = l1.next;
                } else {
                    curr.next = new ListNode(l2.val);
                    curr = curr.next;
                    l2 = l2.next;
                }
            } else if ( l1 != null && l2 == null) {
                curr.next = new ListNode(l1.val);
                curr = curr.next;
                l1 = l1.next;
            } else if ( l1 == null && l2 != null ) {
                curr.next = new ListNode(l2.val);
                curr = curr.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
