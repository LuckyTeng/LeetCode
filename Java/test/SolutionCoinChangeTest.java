package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionCoinChange;

public class SolutionCoinChangeTest {
    @Test
    public void testCoinChange() {
        var sol = new SolutionCoinChange();

        int[] coins = {1,2,5};
        int amount = 11;

        var actual = sol.coinChange(coins, amount);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testCoinChange1() {
        var sol = new SolutionCoinChange();

        int[] coins = {2};
        int amount = 3;

        var actual = sol.coinChange(coins, amount);
        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void testCoinChange2() {
        var sol = new SolutionCoinChange();

        int[] coins = {1};
        int amount = 0;

        var actual = sol.coinChange(coins, amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
