package src;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Map.Entry;

@LeetCodeInformation(Number = 347, Url = "https://leetcode.com/problems/top-k-frequent-elements/")
public class SolutionTopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Entry<Integer,Integer>> q = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for (var entry : map.entrySet()) {
            q.offer(entry);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = q.poll().getKey();
        }
        return ans;   
    }
}
