package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LeetCodeInformation(Number = 49, Url = "https://leetcode.com/problems/group-anagrams/")
public class SolutionGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if ( strs == null || strs.length < 1 ) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for ( var s : strs ) {
            char[] count = new char[26];

            for ( var c : s.toCharArray() ) {
                count[c - 'a']++;
            }
            String key = String.valueOf(count);
            if ( !map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
