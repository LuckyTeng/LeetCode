package src;

@LeetCodeInformation(Number = 190, Url = "https://leetcode.com/problems/reverse-bits/")
public class SolutionReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        for ( int i = 0; i < 32; i++) {
          ans <<= 1;
          if ( ( n & 0x1 ) == 1 ) {
              ans |= 1;
          }
          n >>= 1;
        }
        
        return ans;
    }
}
