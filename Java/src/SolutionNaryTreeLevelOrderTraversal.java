package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@LeetCodeInformation(Number = 429, Url = "https://leetcode.com/problems/n-ary-tree-level-order-traversal/")
public class SolutionNaryTreeLevelOrderTraversal {
    public class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans = new ArrayList<>();

            if (root==null) return ans;
            
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            ans.add(new ArrayList<>());
            ans.get(0).add(root.val);

            while (q.size() > 0) {
                Queue<Node> temp = new LinkedList<>();
                ArrayList<Integer> vals = new ArrayList<>();
                while (q.size() > 0) {
                    Node node = q.poll();

                    for (Node child : node.children) {
                        temp.add(child);
                        vals.add(child.val);
                    }
                }
                if ( vals.size() > 0 )
                    ans.add(vals);
                q = temp;
            }

            return ans;
        }
    }
}
