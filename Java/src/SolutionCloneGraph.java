package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@LeetCodeInformation(Number = 133, Url = "https://leetcode.com/problems/clone-graph/")
public class SolutionCloneGraph {
    public Node cloneGraph(Node node) {
        if ( node == null ) return null;

        if ( node.children.size() == 0 ) return new Node(node.val);

        Set<Node> set = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        Map<Integer, Node> map = new HashMap<>();
        stack.push(node);
        set.add(node);

        Node ans = null;

        while ( stack.size() != 0 ) {
            node = stack.pop();

            Node newNode = null;
            if ( !map.containsKey(node.val) ) {
                newNode = new Node(node.val);
                map.put(newNode.val, newNode);
            } else
                newNode = map.get(node.val);
       
            if ( ans == null ) ans = newNode;

            for (Node neighbor : node.children) {
                Node newNeighbor = null;
                if ( !map.containsKey(neighbor.val) ) {
                    newNeighbor = new Node(neighbor.val);
                    map.put(newNeighbor.val, newNeighbor);
                } else
                    newNeighbor = map.get(neighbor.val);
                newNode.children.add(newNeighbor);
                if ( !set.contains(neighbor) ) {
                    set.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }

        return ans;
    }
}
