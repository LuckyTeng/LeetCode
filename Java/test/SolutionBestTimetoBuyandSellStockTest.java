package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionBestTimetoBuyandSellStock;

public class SolutionBestTimetoBuyandSellStockTest {
    @Test
    public void testMaxProfit() {
        var s = new SolutionBestTimetoBuyandSellStock();

        int[] prices = {7,1,5,3,6,4};
        var actual = s.maxProfit(prices);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxProfit1() {
        var s = new SolutionBestTimetoBuyandSellStock();

        int[] prices = {7,6,4,3,1};
        var actual = s.maxProfit(prices);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
