package src;

@LeetCodeInformation(Number = 5, Url = "https://leetcode.com/problems/longest-palindromic-substring/")
public class SolutionLongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if ( s == null || s.length() < 1 ) return "";

        int start = 0, end = 0;

        for ( int i = 0; i < s.length(); i++ ) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if ( len > end - start ) {
                start = i - ( len - 1 ) /2 ;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right)
    {
        int L = left, R = right;

        // if current is Palindromic, expand two pointer to side
        while ( L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R) ) {
            L--;
            R++;
        }
        return R - L - 1; // for odd 1, 3, 5... for even 2, 4, 6...
    }
}
