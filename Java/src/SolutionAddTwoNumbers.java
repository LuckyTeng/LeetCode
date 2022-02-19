package src;

@LeetCodeInformation(Number = 2, Url = "https://leetcode.com/problems/add-two-numbers/")
public class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;

        while ( l1 != null || l2 != null ) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = carry + val1 + val2;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if ( sum >= 10 )
                carry = 1;
            else
                carry = 0;

            if ( l1 != null ) l1 = l1.next;
            if ( l2 != null ) l2 = l2.next;
        }

        if ( carry == 1 )
            curr.next = new ListNode(1);

        return ans.next;
    }
}
