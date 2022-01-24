package src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@LeetCodeInformation(Number = 105, Url = "https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/")
public class SolutionBinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        Queue<TreeNode> temp = new ArrayDeque<>();

        List<List<Integer>> ans = new ArrayList<>();
        
        if ( root == null ) return ans;

        q.offer(root);

        while ( !q.isEmpty() ) {
            List<Integer> leverOutput = new ArrayList<>();
            while (!q.isEmpty()) {
                var node = q.poll();

                leverOutput.add(node.val);
                if (node.left != null) temp.offer(node.left);
                if (node.right != null) temp.offer(node.right);
            }

            q = temp;
            temp = new ArrayDeque<>();
            ans.add(leverOutput);
        }
        
        return ans;
    }
}
