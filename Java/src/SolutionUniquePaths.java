package src;

@LeetCodeInformation(Number = 62, Url = "https://leetcode.com/problems/unique-paths/")
public class SolutionUniquePaths {
    public int uniquePaths(int m, int n) {
        if ( n < m ) {
            int t = n;
            n = m;
            m = t;
        }
        int[] map = new int[m];

        for (int i = 0; i < m; i++) {
            map[i] = 1;
        }
        
        for( int j = n-2; j >= 0; j--) {
            int val = 1;
            for (int i = m-2; i >= 0; i--) {
                val += map[i];
                map[i] = val;
            }
        }
        return map[0];
    }
}
