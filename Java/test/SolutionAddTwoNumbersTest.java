package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CommonHelper;
import src.ListNode;
import src.SolutionAddTwoNumbers;

public class SolutionAddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers() {
        var sol = new SolutionAddTwoNumbers();

        ListNode l1 = CommonHelper.BuildListNode(new int[] {2,4,3});
        ListNode l2 = CommonHelper.BuildListNode(new int[] {5,6,4});

        var actual = sol.addTwoNumbers(l1, l2);
        ListNode expected = CommonHelper.BuildListNode(new int[] {7,0,8});

        while ( expected != null ) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void testAddTwoNumbers1() {
        var sol = new SolutionAddTwoNumbers();

        ListNode l1 = CommonHelper.BuildListNode(new int[] {0});
        ListNode l2 = CommonHelper.BuildListNode(new int[] {0});

        var actual = sol.addTwoNumbers(l1, l2);
        ListNode expected = CommonHelper.BuildListNode(new int[] {0});

        while ( expected != null ) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void testAddTwoNumbers2() {
        var sol = new SolutionAddTwoNumbers();

        ListNode l1 = CommonHelper.BuildListNode(new int[] {9,9,9,9,9,9,9});
        ListNode l2 = CommonHelper.BuildListNode(new int[] {9,9,9,9});

        var actual = sol.addTwoNumbers(l1, l2);
        ListNode expected = CommonHelper.BuildListNode(new int[] {8,9,9,9,0,0,0,1});

        while ( expected != null ) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
