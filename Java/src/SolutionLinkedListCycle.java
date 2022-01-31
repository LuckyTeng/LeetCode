package src;

import java.util.HashSet;
import java.util.Set;

public class SolutionLinkedListCycle {
    public boolean hasCycle(ListNode head) {
        int solution = 0;
        if ( solution == 1 )
            return hashSolution(head);

        return twoPointerSolution(head);
    }

    private boolean twoPointerSolution(ListNode head) {
        if ( head == null || head.next == null ) return false;

        ListNode slow = head;
        ListNode fast = slow.next;

        while ( slow != fast ) {
            if ( fast == null || fast.next == null ) return false;
            slow = slow.next;
            fast = fast.next.next;
        } 
        return true;
    }
    
    private boolean hashSolution(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while ( head != null ) {
            if ( set.contains(head) )
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
