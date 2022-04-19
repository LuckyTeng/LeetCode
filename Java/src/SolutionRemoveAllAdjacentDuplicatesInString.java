package src;

import java.util.Stack;

@LeetCodeInformation(Number = 1047, Url = "https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/")
public class SolutionRemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        int n = s.length();

        if ( n <= 1 ) return s;

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if ( !stack.isEmpty() && stack.peek() == s.charAt(i) ) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if ( stack.size() == 0 ) return "";

        char[] temp = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            temp[i] = stack.elementAt(i);
        }

        return new String(temp);
    }
}
