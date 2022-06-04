package test;

import org.junit.Test;

import src.Node;

public class SolutionNaryTreeLevelOrderTraversal_SolutionTest {
    @Test
    public void testLevelOrder() {


        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        
    }
}
