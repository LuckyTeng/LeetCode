package src;

import java.util.Arrays;

@LeetCodeInformation(Number = 242, Url = "https://leetcode.com/problems/valid-anagram/")
public class SolutionValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b));
    }
}
