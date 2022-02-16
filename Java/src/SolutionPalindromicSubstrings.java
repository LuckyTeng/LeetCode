package src;

@LeetCodeInformation(Number = 647, Url = "https://leetcode.com/problems/palindromic-substrings/")
public class SolutionPalindromicSubstrings {
    private int count;

    public int countSubstrings(String s) {
        int n = s.length();

        if ( n <= 1 ) return n;

        for (int i = 0; i < s.length(); i++) {
            extendPalindromic(s, n, i, i);
            extendPalindromic(s, n, i, i+1);
        }
        return count;    
    }

    private void extendPalindromic(String s, int n, int left, int right) {
        while ( left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
