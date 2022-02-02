package src;

@LeetCodeInformation(Number = 191, Url = "https://leetcode.com/problems/number-of-1-bits/")
public class SolutionNumberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        
        while ( n != 0 ) {
            sum++;
            n &= (n - 1);
        }
        
        return sum;
    }
}
