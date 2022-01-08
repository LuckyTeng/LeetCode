package src;

import java.util.Stack;

public class SolutionValidParentheses {
    public Boolean IsValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ( c == '(' || c == '[' || c == '{' ) {
                stack.push(c);
                continue;
            }
            
            if ( stack.size() <= 0 ) return false; // no pair

            Character p = stack.peek();
            Character ppair = '\0';
            if ( c == ')' )
                ppair = '(';
            else if ( c == ']' )
                ppair = '[';
            else if ( c == '}' )
                ppair = '{';

            if ( p == ppair )
                stack.pop();
            else
                return false; // no pair found
            
        }
        return stack.size() == 0;
    }
}
