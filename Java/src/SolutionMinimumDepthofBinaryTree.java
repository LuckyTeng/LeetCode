package src;

import java.util.LinkedList;
import java.util.Queue;

@LeetCodeInformation(Number = 111, Url = "https://leetcode.com/problems/minimum-depth-of-binary-tree/")
public class SolutionMinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int ans = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (q.size() > 0) {
            Queue<TreeNode> temp = new LinkedList<>();
            while (q.size() > 0) {
                TreeNode node = q.poll();

                if (node.left == null && node.right == null)
                    return ans;
                if (node.left != null)
                    temp.offer(node.left);
                if (node.right != null)
                    temp.offer(node.right);
            }
            ans++;
            q = temp;
        }

        return ans;
    }
}
