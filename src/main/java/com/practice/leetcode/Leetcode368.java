package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        Map<String, List<Integer>> cache = new HashMap<>();
        return dfs(0, 1, nums, cache);
    }

    private List<Integer> dfs(int i, int prev, int[] nums, Map<String, List<Integer>> cache) {
        if (i == nums.length) {
            return new ArrayList<>();
        }
        String key = i + "-" + prev;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        List<Integer> res = dfs(i + 1, prev, nums, cache);

        if (nums[i] % prev == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.addAll(dfs(i + 1, nums[i], nums, cache));
            if (temp.size() > res.size()) {
                res = temp;
            }
        }

        cache.put(key, res);
        return res;
    }

}
