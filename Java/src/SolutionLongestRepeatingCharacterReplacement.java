package src;

@LeetCodeInformation(Number = 424, Url = "https://leetcode.com/problems/longest-repeating-character-replacement/")
public class SolutionLongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int start = 0, end = 0;
        int n = s.length();
        int ans = 0;
        int max = 0;
        
        int[] counts = new int[26];

        while ( end < n ) {
            char c = s.charAt(end);
            max = Math.max(max, ++counts[c - 'A']);

            while ( k < end - start + 1 - max ) {
                c = s.charAt(start++);
                counts[c - 'A']--;
            }
            ans = Math.max(ans, end - start + 1);
            end++;
        }

        return ans;
    }
}
