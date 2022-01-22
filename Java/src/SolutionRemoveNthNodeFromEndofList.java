package src;

@LeetCodeInformation(Number = 19, Url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list/")
public class SolutionRemoveNthNodeFromEndofList {
    public class ListNode {
        public int val;
        public ListNode next;
    
        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode leader = head;
        ListNode follower = head;

        for ( int i = 0; i < n; i ++ ) {
            // n < length of list, leader.next never null
            leader = leader.next;
        }

        // if leader == null, this means we remove head node
        if ( leader == null )
            return head.next;

        while ( leader.next != null ) {
            leader = leader.next;
            follower = follower.next;
        }

        // skip follower next node
        if ( follower.next.next != null)
            follower.next = follower.next.next;
        else
            follower.next = null;

        return head;
    }
}
