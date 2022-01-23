package src;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInformation(Number = 76, Url = "https://leetcode.com/problems/minimum-window-substring/")
public class SolutionMinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if ( s.length() == 0 || t.length() == 0 ) return "";

        Map<Character, Integer> dictT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            int count = dictT.getOrDefault(t.charAt(i), 0);
            dictT.put(t.charAt(i), count + 1);
        }

        int required = dictT.size();
        int l = 0, r = 0;
        int formed = 0;
        Map<Character, Integer> windowCount = new HashMap<>();
        int[] ans = {-1, 0, 0 }; // [size, left, right];
        while ( r < s.length()) {
            char c = s.charAt(r);
            int count = windowCount.getOrDefault(c, 0);
            windowCount.put(c, count+1);

            if ( dictT.containsKey(c) && windowCount.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            while ( l <= r && required == formed ) {
                c = s.charAt(l);

                if ( ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCount.put(c, windowCount.get(c)-1);

                if ( dictT.containsKey(c) && windowCount.get(c).intValue() < dictT.get(c).intValue() ) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2]+1);
    }
}
