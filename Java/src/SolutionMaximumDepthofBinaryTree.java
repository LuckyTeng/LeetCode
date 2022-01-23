package src;

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

    public int maxDepth(TreeNode root) {
        if ( root == null )
            return 0;
        
        return maxDepth(root, 1);
    }

    private int maxDepth(TreeNode root, int deep) {
        if ( root.left == null && root.right == null ) return deep;

        int nextLevel = deep + 1;
        if ( root.left != null )
            deep = maxDepth(root.left, nextLevel);
        if ( root.right != null )
            deep = Math.max(maxDepth(root.right, nextLevel), deep); // deep is max from left, so select max

        return deep;
    }
}
