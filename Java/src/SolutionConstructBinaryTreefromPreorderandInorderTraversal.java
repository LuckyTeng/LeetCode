package src;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInformation(Number = 105, Url = "https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/")
public class SolutionConstructBinaryTreefromPreorderandInorderTraversal {

    private Map<Integer, Integer> inMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode buildTree(Integer preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if ( inStart > inEnd ) return null;

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        int i = inMap.get(rootVal);

        root.left = buildTree(preStart+1, inStart, i - 1, preorder, inorder);
        root.right = buildTree(preStart + i - inStart + 1, i + 1, inEnd, preorder, inorder);
        return root;
    }
}
