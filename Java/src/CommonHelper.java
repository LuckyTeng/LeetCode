package src;

import java.util.LinkedList;

/**   
    Common Helper functions.
    @author teng
 */
final public class CommonHelper {
    public static TreeNode BuildTree(Integer[] tree) {
    TreeNode root = null ;
        if ( tree.length == 0 ) return root;
        if ( tree.length == 1 ) {
            root = new TreeNode(tree[0]);
            return root;
        }

        root = new TreeNode();
        int i = 1;
        int n = tree.length;

        LinkedList<TreeNode> queue = new LinkedList<>();

        root.val = tree[0];
        queue.addFirst(root);

        while ( !queue.isEmpty() ) {
            var node = queue.removeLast();
            
            if ( i >= n ) break;
            if ( tree[i] != null ) {
                node.left = new TreeNode(tree[i]);
                queue.addFirst(node.left);
            }
            i++;
            if ( i >= n ) break;
            if ( tree[i] != null ) {
                node.right = new TreeNode(tree[i]);
                queue.addFirst(node.right);
            }
            i++;
        }

        return root;
    }

    public static ListNode BuildListNode(int[] list) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        
        if ( list == null ) return head;

        for (int i = 0; i < list.length; i++) {
            ListNode tmp = new ListNode(list[i]);
            curr.next = tmp;
            curr = curr.next;
        }

        return head.next;
    }
}
