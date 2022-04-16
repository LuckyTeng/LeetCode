package src;

import java.util.LinkedList;
import java.util.Queue;

@LeetCodeInformation(Number = 225, Url = "https://leetcode.com/problems/implement-stack-using-queues/")
public class SolutionImplementStackusingQueues {
    public class MyStack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        private int top;
        
        public MyStack() {
            
        }
        
        public void push(int x) {
            q1.add(x);
            top = x;
        }
        
        public int pop() {
            while ( q1.size() > 1 ) {
                top = q1.remove();
                q2.add(top);
            }

            int ans = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return ans;
        }
        
        public int top() {
            return top;
        }
        
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }
}
