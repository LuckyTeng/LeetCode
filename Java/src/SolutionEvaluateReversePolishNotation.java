package src;

import java.util.Stack;

@LeetCodeInformation(Number = 211, Url = "https://leetcode.com/problems/design-add-and-search-words-data-structure/")
public class SolutionEvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            int temp = 0;
            if (token.equals("+")) {
                temp = stack.pop();
                stack.push(stack.pop() + temp);
            } else if (token.equals("-")) {
                temp = stack.pop();
                stack.push(stack.pop() - temp);
            } else if (token.equals("*")) {
                temp = stack.pop();
                stack.push(stack.pop() * temp);
            } else if (token.equals("/")) {
                temp = stack.pop();
                stack.push(stack.pop() / temp);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
