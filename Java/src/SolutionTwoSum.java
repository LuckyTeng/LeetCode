package src;


@LeetCodeInformation(Number = 1, Url = "https://leetcode.com/problems/two-sum/")
public class SolutionTwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length * 2;
        int[] hash = new int[n];
        int[] hashKey = new int[n];
        boolean zero = false;
        int zeroKey = -1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int comp = target - num;
            
            boolean found = false;
            int foundKey = -1;
            int k = -1521134295 * comp;
            if ( k < 0 )
                k = -k;
            int hc = (k % n);
            if ( comp == 0 ) {
                found = zero;
            } else {
                int j = 0;
                int hj = ( hc + j ) % n; 
                while (j < n && hash[hj] != 0) {
                    if (hash[hj] == comp) {
                        found = true;
                        foundKey = hashKey[hj];
                        break;
                    }
                    j++;
                    hj = ( hc + j ) % n; 
                }
            }
            
            if ( found ) {
                if ( comp == 0 ) 
                    return new int[] { i, zeroKey};
                else
                    return new int[] { i, foundKey};
            }
            if ( num != 0 ) {
                int kh = -1521134295 * num;
                if ( kh < 0 )
                    kh = -kh;
                int h = (kh % n);
                while ( hash[h] != 0 ) {
                    h = (h+1) % n;
                }
                hash[h] = num;
                hashKey[h] = i;
            } else {
                zero = true;
                zeroKey = i;
            }
        }    

        return new int[]{};
    }
}