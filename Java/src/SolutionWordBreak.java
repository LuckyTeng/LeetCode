package src;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

@LeetCodeInformation(Number = 139, Url = "https://leetcode.com/problems/word-break/")
public class SolutionWordBreak {
    
    public boolean wordBreak(String s, List<String> wordDict) {    
        int solution = 1;

        // return wordBreakBruteForce(s, new HashSet<>(wordDict), 0);
        if ( solution == 0 )
            return wordBreakMemo(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
        else
            return wordBreakBFS(s, wordDict);
    }

    private boolean wordBreakBruteForce(String s, HashSet<String> wordDict, int start) {
        if ( start == s.length() ) return true;

        for (int end = start + 1; end <= s.length(); end++) {
            if ( wordDict.contains(s.substring(start, end)) && 
            wordBreakBruteForce(s, wordDict, end )) {
                return true;
            }
        }
        return false;
    }

    private boolean wordBreakMemo(String s, HashSet<String> wordDict, int start, Boolean[] memo) {
        if ( start == s.length() ) return true;
        
        if ( memo[start] != null ) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            if ( wordDict.contains(s.substring(start, end)) && 
            wordBreakBruteForce(s, wordDict, end )) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }

    private boolean wordBreakBFS(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[s.length()];
        queue.add(0);
        while ( !queue.isEmpty() ) {
            int start = queue.remove();
            if ( visited[start] ) {
                continue;
            }
            for (int end = start + 1; end <= s.length(); end++) {
                if ( wordDictSet.contains(s.substring(start, end)) ) {
                    queue.add(end);
                    if ( end == s.length() ) {
                        return true;
                    }
                }
            }
            visited[start] = true;
        }
        return false;
    }
}
