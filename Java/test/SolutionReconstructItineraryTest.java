package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import src.SolutionReconstructItinerary;

public class SolutionReconstructItineraryTest {
    @Test
    public void testFindItinerary() {
        var sol = new SolutionReconstructItinerary();

        var actual = sol.findItinerary(new String[][] { {"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"},
            {"ATL","JFK"}, {"ATL", "SFO"}});  

        List<String> expected = Arrays.asList(new String[]{"JFK", "ATL", "JFK", "SFO", "ATL", "SFO"});

        assertEquals(expected, actual);
    }
}
