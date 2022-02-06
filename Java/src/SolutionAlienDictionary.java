package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

@LeetCodeInformation(Number = 269, Url = "https://leetcode.com/problems/alien-dictionary/")
public class SolutionAlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> adj = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>(); // number of vertex point to character
        for (String word: words) {
            for (char c : word.toCharArray()) {
                indegree.put(c, 0);
            }
        }

        for (int i = 1; i < words.length; i++) {
            int minLen = Math.min(words[i].length(), words[i-1].length());
            char[] arr1 = words[i-1].toCharArray(), arr2 = words[i].toCharArray();
            for (int j = 0; j < minLen; j++) {
                if ( arr1[j] != arr2[j] ) {
                    Set<Character> set = adj.containsKey(arr1[j]) ? adj.get(arr1[1]) : new HashSet<>();
                    if (!set.contains(arr2[j])) {
                        set.add(arr2[j]);
                        adj.put(arr1[j], set);
                        indegree.put(arr2[j], indegree.get(arr2[j]) + 1);
                    }
                }
            }
        }

        Queue<Character> q = new LinkedList<>();
        for(Character c : indegree.keySet()){
            if(indegree.get(c) == 0) q.offer(c);
        }
        StringBuilder result = new StringBuilder();
        while(!q.isEmpty()){
            char c = q.poll();
            result.append(c);
            if(adj.get(c) == null) continue;
            for(Character neigh: adj.get(c)){
                indegree.put(neigh, indegree.get(neigh) - 1);
                if(indegree.get(neigh) == 0) q.offer(neigh);
            }
        }
        for(int count: indegree.values()){
            if(count > 0) return "";
        }
        return result.toString();
    }
}
