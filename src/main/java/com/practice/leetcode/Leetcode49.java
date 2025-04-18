package com.practice.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for (String str : strs) {
            List<Integer> freq = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                freq.add(0);
            }

            for (char ch : str.toCharArray()) {
                freq.set(ch - 'a', freq.get(ch - 'a') + 1);
            }

            if (!map.containsKey(freq)) {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(freq, newList);
            } else {
                map.get(freq).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}
