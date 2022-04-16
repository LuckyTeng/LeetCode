package src;

@LeetCodeInformation(Number = 459, Url = "https://leetcode.com/problems/repeated-substring-pattern/")
public class SolutionRepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        // return repeatedSubstringPatternKMP(s);
        return repeatedSubstringPatternRotation(s);
    }

    public boolean repeatedSubstringPatternRotation(String s) {
        int n = s.length();

        String ss = s + s;
        ss = ss.substring(1, 2*n - 1);

        return ss.contains(s);
    }

    public boolean repeatedSubstringPatternKMP(String s) {
        int n = s.length();

        int[] dp = new int[n+1];

        int i = 0, j = 1;

        // Build KMP
        while ( j < n ) {
            if ( s.charAt(j) == s.charAt(i) ) dp[++j] = ++i;
            else if ( i == 0 ) j++;
            else i = dp[i];
        }

        // dp[n] > 0 => last char has prefix
        // n - dp[n] repeat pattern length
        // can dp[n] divide it by it        
        return dp[n] > 0 && ( dp[n] % ( n - dp[n]) == 0);
    }
}
