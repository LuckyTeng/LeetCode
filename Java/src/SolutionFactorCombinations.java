package src;

import java.util.ArrayList;
import java.util.List;

public class SolutionFactorCombinations {

    void backtrack(List<List<Integer>> ans, List<Integer> temp, int n, int product, int index) {
        if ( product > n )
            return;

        if ( product == n ) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for ( int i = index; i <= n / product; i++) {
            if ( (n % i) == 0 && i != n ) {
                temp.add(i);
                backtrack(ans, temp, n, product * i, i);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(ans, new ArrayList<>(), n, 1, 2);
        return ans;
    }
}
