package src;

import java.util.LinkedList;
import java.util.Queue;

@LeetCodeInformation(Number = 104, Url = "https://leetcode.com/problems/maximum-depth-of-binary-tree/")
public class SolutionMaximumDepthofBinaryTree {
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

    int method = 0;
    public int maxDepth(TreeNode root) {
        if ( root == null )
            return 0;
        
        if ( method == 0)
            return maxDepthBFS(root);
        else
            return maxDepthRecur(root, 1);
    }

    private int maxDepthBFS(TreeNode root) {
        int ans = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (q.size() > 0) {
            Queue<TreeNode> temp = new LinkedList<>();
            boolean hasChild = false;
            while (q.size() > 0) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    temp.offer(node.left);
                    hasChild = true;
                }
                if (node.right != null) {
                    temp.offer(node.right);
                    hasChild = true;
                }
            }
            if (hasChild)
                ans++;
            q = temp;
        }

        return ans;
    }

    private int maxDepthRecur(TreeNode root, int deep) {
        if ( root.left == null && root.right == null ) return deep;

        int nextLevel = deep + 1;
        if ( root.left != null )
            deep = maxDepthRecur(root.left, nextLevel);
        if ( root.right != null )
            deep = Math.max(maxDepthRecur(root.right, nextLevel), deep); // deep is max from left, so select max

        return deep;
    }
}
