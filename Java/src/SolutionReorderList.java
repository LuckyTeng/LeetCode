package src;

import java.util.Stack;

@LeetCodeInformation(Number = 143, Url = "https://leetcode.com/problems/reorder-list/")
public class SolutionReorderList {
    public void reorderList(ListNode head) {
        int n = 0;
        var curr = head;
        Stack<ListNode> stack = new Stack<>();
        while ( curr != null ) {
            n++;
            stack.push(curr);
            curr = curr.next;
        }

        int half = n / 2;

        curr = head;
        ListNode temp = null;
        for (int i = 0; i < half; i++) {
            // attach last node to curr
            temp = curr.next; // save curr next
            var attached = stack.pop();
            curr.next = attached;
            if ( attached != temp )
                attached.next = temp; // reattach save node
            else
                attached.next = null;
            curr = temp; // forward curr
        }

        if ( n % 2 == 1 ) curr.next = null; // set last node to null
    }
}
