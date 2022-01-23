package src;

@LeetCodeInformation(Number = 91, Url = "https://leetcode.com/problems/decode-ways/")
public class SolutionDecodeWays {
    public int numDecodings(String s) {
        // leading zero will not decode anything
        if ( s.charAt(0) == '0' ) return 0;
        // length = 1 and not leading zero always in [1..9]
        if ( s.length() == 1 ) return 1;

        int n = s.length();
        int[] ans = new int[n + 1];
        ans[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            // check 1 char box
            if ( c >= '1' && c <= '9' ) {
                ans[i] = ans[i+1];
            }

            // check 2 char box
            if ( i + 1 < n) {
                char c2 = s.charAt(i+1);
                if ( c == '1' && c2 >= '0' && c2 <= '9' ) {
                    ans[i] += ans[i+2];
                }

                if ( c == '2' && c2 >= '0' && c2 <= '6' ) {
                    ans[i] += ans[i+2];
                }
            }
        }

        return ans[0];
    }
}
