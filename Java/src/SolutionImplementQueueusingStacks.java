package src;

import java.util.Stack;

@LeetCodeInformation(Number = 234, Url = "https://leetcode.com/problems/implement-queue-using-stacks/")
public class SolutionImplementQueueusingStacks {
    public class MyQueue {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        private int front;
        
        public MyQueue() {
            
        }
        
        public void push(int x) {
            if ( stack1.isEmpty() )
                front = x;
            stack1.push(x);
        }
        
        public int pop() {
            if ( stack2.isEmpty()) {
                while ( !stack1.isEmpty() )
                    stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        
        public int peek() {
            if ( !stack2.isEmpty() )
                return stack2.peek();
            return front;
        }
        
        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}
