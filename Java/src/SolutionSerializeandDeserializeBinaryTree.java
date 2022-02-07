package src;

import java.util.LinkedList;
import java.util.Queue;

// Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

// Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

// Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
@LeetCodeInformation(Number = 297, Url = "https://leetcode.com/problems/serialize-and-deserialize-binary-tree/")
public class SolutionSerializeandDeserializeBinaryTree {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            String prefix = "";

            while ( !q.isEmpty() ) {
                TreeNode node = q.poll();
                if ( node != null ) {
                    q.offer(node.left);
                    q.offer(node.right);

                    sb.append(prefix + node.val);
                } else {
                    sb.append(prefix + "null");
                }
                prefix = ",";
            }

            sb.append("]");
            
            return sb.toString();
        }
    
        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            int n = data.length();
            TreeNode root = null, left = null, right = null;
            TreeNode emptyNode = new TreeNode();

            if ( n <= 2 ) return null;

            Queue<TreeNode> q = new LinkedList<>();
            String s = "";
            int i = 0;

            if ( data.charAt(i++) == '[' ) {
                while ( data.charAt(i) != ']' ) {
                    char c = data.charAt(i);
                    if ( c != ',' ) {
                        s += c;
                    } else {
                        if ( root == null ) {
                            root = new TreeNode(Integer.parseInt(s));
                            q.offer(root);
                        } else {
                            if ( left == null ) {
                                if ( s.equals("null") )
                                    left = emptyNode;
                                else
                                    left = new TreeNode(Integer.parseInt(s));
                            } else {
                                if ( s.equals("null") )
                                    right = emptyNode;
                                else
                                    right = new TreeNode(Integer.parseInt(s));

                                var node = q.poll();
                                if ( left != emptyNode ) {
                                    node.left = left;
                                    q.offer(left);
                                }

                                if ( right != emptyNode ) {
                                    node.right = right;
                                    q.offer(right);
                                }
                                left = null; right = null;;
                            }
                            
                        }
                        s = "";
                    }
                    i++;
                }
            }
            
            return root;
        }
    }
}
