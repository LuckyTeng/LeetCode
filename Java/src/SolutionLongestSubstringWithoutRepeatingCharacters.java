package src;

public class SolutionLongestSubstringWithoutRepeatingCharacters {
    public int LengthOfLongestSubstring(String s) {
        int ans = 0;
        int[] index = new int[128];
        int n = s.length();

        for (int i = 0, j = 0; j < n; j++ )
        {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(j - i + 1, ans);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
