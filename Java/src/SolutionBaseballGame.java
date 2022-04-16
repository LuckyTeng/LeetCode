package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

@LeetCodeInformation(Number = 682, Url = "https://leetcode.com/problems/baseball-game/")
public class SolutionBaseballGame {
    public int calPoints(String[] ops) {
        int result = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            char c = op.charAt(0);
            if ( ( c >= '0' && c <= '9' ) || c == '-' ) {
                stack.push(Integer.parseInt(op));
            } else if ( c == 'C' ) {
                stack.pop();
            } else if ( c == 'D' ) {
                stack.push(stack.peek() * 2);
            } else if ( c == '+' ) {
                int first = stack.pop();
                int sum = first + stack.peek();
                stack.push(first);
                stack.push(sum);
            }
        }

        result = 0;
        while ( !stack.isEmpty() ) {
            result += stack.pop();
        }
        return result;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        result.add(new ArrayList<>());
        
        backlog(result, temp, nums, 0 );

        
        return result;
    }

    private void backlog(List<List<Integer>> result, LinkedList<Integer> temp, int[] nums, int i) {
        for (; i < nums.length; i++) {
            temp.addLast(nums[i]);
            result.add(new ArrayList<>(temp));
            backlog(result, temp, nums, i + 1 );
            temp.removeLast();
        }
    }
}
