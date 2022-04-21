package test;

import org.junit.Test;

import src.Node;
import src.SolutionNaryTreeLevelOrderTraversal;

public class SolutionNaryTreeLevelOrderTraversal_SolutionTest {
    @Test
    public void testLevelOrder() {
        var sol = new SolutionNaryTreeLevelOrderTraversal();

        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        
    }
}
