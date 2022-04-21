package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

import src.Node;
import src.SolutionCloneGraph;

public class SolutionCloneGraphTest {
    @Test
    public void testCloneGraph() {
        var s = new SolutionCloneGraph();

        var node1 = new Node(1);
        var node2 = new Node(2);
        var node3 = new Node(3);
        var node4 = new Node(4);

        node1.children.add(node2);
        node1.children.add(node4);
        node2.children.add(node1);
        node2.children.add(node3);
        node3.children.add(node2);
        node3.children.add(node4);
        node4.children.add(node1);
        node4.children.add(node3);

        var node = s.cloneGraph(node1);

        assertNotNull(node);
        assertGraphEqual(node1, node);
    }

    @Test
    public void testCloneGraph1() {
        var s = new SolutionCloneGraph();

        var node1 = new Node(1);
        var node = s.cloneGraph(node1);

        assertNotNull(node);
        assertGraphEqual(node1, node);
    }

    @Test
    public void testCloneGraph2() {
        var s = new SolutionCloneGraph();

        Node node1 = null;
        Node node = s.cloneGraph(node1);

        assertNull(node);
    }

    void assertGraphEqual(Node node1, Node node2) {
        Stack<Node> stack = new Stack<>();
        Map<Integer, Node> map1 = new HashMap<>();
        Map<Integer, Node> map2 = buildGraphMap(node2);

        stack.push(node1);
        map1.put(node1.val, node1);

        while ( stack.size() != 0 ) {
            Node node = stack.pop();

            node2 = map2.get(node.val);
            assertEquals(node.val, node2.val);
            assertNotSame("obj not deep clone", node, node2);
            for (Node neighbor : node.children) {
                assertEquals(true, isInNeighbors(neighbor.val, node2.children)); 
                if ( !map1.containsKey(neighbor.val) ) {
                    map1.put(neighbor.val, neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }

    private Map<Integer, Node> buildGraphMap(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        Stack<Node> stack = new Stack<>();

        stack.push(node);
        map.put(node.val, node);

        while ( stack.size() != 0 ) {
            node = stack.pop();

            for (Node neighbor : node.children) {
                if ( !map.containsKey(neighbor.val) ) {
                    map.put(neighbor.val, neighbor);
                    stack.push(neighbor);
                }
            }
        }

        return map;
    }

    private boolean isInNeighbors(int val, List<Node> neighbors) {
        for (Node node : neighbors) {
            if ( node.val == val ) return true;
        }
        return false;
    }
}
