package src;

import java.util.LinkedList;
import java.util.Queue;

// DoorDash Interview question
//At DoorDash, menus are updated daily even hourly to keep them up-to-date. Each menu can be regarded as a tree. When the merchant sends us the latest menu, can we calculate how many nodes has changed?
//         Existing tree
    //            a(1)
    //         /       \
    //      b(2)       c(3)
    //     /     \         \
    //   d(4)    e(5)      f(6)
//         New tree
    //            a(1)
    //         /       \
    //      b(2)       c(3)
    //     /     \          \
    //   d(4)    e(5)   g(6)
    //                              \
    //                               f(6)
public class SolutionMenuChange {
    public int MenuChange(TreeNode a, TreeNode b) {
        if ( a == null ) return total_node(b);
        if ( b == null ) return total_node(a);

        int ans = 0;

        if ( a.val != b.val ) {
            ans++;
        }

        if ( a.left != null || b.left != null ) {
            if ( a.left == null) 
                ans += total_node(b);
            else if ( b.left == null )
                ans += total_node(a);
            else
                ans += MenuChange(a.left,b.left);
        }

        if ( a.right != null || b.right != null ) {
            if ( a.right == null) 
                ans += total_node(b);
            else if ( b.right == null )
                ans += total_node(a);
            else
                ans += MenuChange(a.right,b.right);
        }
        return ans;
    }

    private int total_node(TreeNode root) {
        if ( root == null ) return 0;

        int count = 1;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> tmp = null;
        q.offer(root);

        while ( !q.isEmpty() ) {
            var node = q.poll();
            tmp = new LinkedList<>();

            if ( node.left != null ) {
                tmp.offer(node.left);
                count++;
            }

            if ( node.right != null ) {
                tmp.offer(node.right);
                count++;
            }

            q = tmp;
        }

        return count;
    }
}
