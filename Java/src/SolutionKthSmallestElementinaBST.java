package src;

@LeetCodeInformation(Number = 230, Url = "https://leetcode.com/problems/kth-smallest-element-in-a-bst/")
public class SolutionKthSmallestElementinaBST {
    class LinkList<E> {
        E value;
        LinkList<E> next;
    }
    public int kthSmallest(TreeNode root, int k) {
        LinkList<TreeNode> head = new LinkList<>();

        while (true) {
            while ( root != null ) {
                LinkList<TreeNode> temp = new LinkList<>();
                temp.value = root;
                if ( head.next == null ) head.next = temp;
                else {
                    temp.next = head.next;
                    head.next = temp;
                }
                root = root.left;
            }
            root = head.next.value;
            if ( head.next != null)
                head.next = head.next.next;
            if ( --k == 0 ) return root.val;
            root = root.right;
        }
    }
}
