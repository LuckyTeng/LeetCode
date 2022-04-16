package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionSerializeandDeserializeBinaryTree;

public class SolutionSerializeandDeserializeBinaryTreeTest {
    @Test
    public void testCodec() {
        var sol = new SolutionSerializeandDeserializeBinaryTree();

        var codec = sol.new Codec();
        Integer[] tree = {1,2,3,null,null,4,5};
        var root = CommonHelper.BuildTree(tree);

        var data = codec.serialize(root);
        var actual = codec.deserialize(data);

        assertEquals(actual.val, 1);
        assertEquals(actual.left.val, 2);
        assertEquals(actual.right.val, 3);
        assertEquals(actual.right.left.val, 4);
        assertEquals(actual.right.right.val, 5);
    }
}
