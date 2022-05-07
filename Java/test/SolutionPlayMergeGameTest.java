package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import src.SolutionPlayMergeGame;

public class SolutionPlayMergeGameTest {
    @Test
    public void testWhoMinMergeGame() {
        var sol = new SolutionPlayMergeGame();

        List<Stack<Integer>> tiles = new ArrayList<>();
        var st = new Stack<Integer>();
        st.push(0);
        tiles.add(st);
        st = new Stack<Integer>();
        st.push(0);
        tiles.add(st);
        st = new Stack<Integer>();
        st.push(1);
        tiles.add(st);
        st = new Stack<Integer>();
        st.push(1);
        tiles.add(st);
        
        var actual = sol.whoMinMergeGame(tiles);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
