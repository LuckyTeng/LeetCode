package src;

@LeetCodeInformation(Number = 371, Url = "https://leetcode.com/problems/sum-of-two-integers/")
public class SolutionSumofTwoIntegers {
    public int getSum(int a, int b) {        
        // 01 & 01 = 01  01 ^ 01 = 00  01 << 1 = 10
        int tmp = b;
        int carry = 0;
        do {
            carry = a & tmp;
            a = a ^ tmp;
            tmp = carry << 1;
        } while ( carry != 0 );

        return a;
    }
}
