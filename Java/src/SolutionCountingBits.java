package src;

@LeetCodeInformation(Number = 233817, Url = "https://leetcode.com/problems/counting-bits/")
public class SolutionCountingBits {
    public int[] countBits(int n) {        
        int[] ans = new int[n+1];
        ans[0] = 0; if ( n == 0 ) return ans;
        ans[1] = 1; if ( n == 1 ) return ans;
        
        int l = 1, u = 2;
        while ( l + 1 <= n ) {
            for ( int i = l + 1; i < u && i <= n; i++ ) {
                ans[i] = ans[l] + ans[i-l];
            }
            l <<= 1; u <<= 1;
            if ( l <= n ) {
                ans[l] = 1;
            }
        }
        return ans;
    }
}
