package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.SolutionEncodeandDecodeStrings;

public class SolutionEncodeandDecodeStringsTest {
    @Test
    public void test() {
        var sol = new SolutionEncodeandDecodeStrings();

        List<String> strs = new ArrayList<>();
        strs.add("abc");
        strs.add("mpg");
        
        var en = sol.encode(strs);
        var actual = sol.decode(en);

        assertEquals("abc", actual.get(0));
        assertEquals("mpg", actual.get(1));
    }
}
