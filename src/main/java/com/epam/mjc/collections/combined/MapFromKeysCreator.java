package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> result = new HashMap<>();
        Map<String,Integer> helper = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            helper.put(entry.getKey(),entry.getKey().length());
        }
        Set<Integer> help = new HashSet<>(helper.values());
        for (Integer i : help) {
            Set<String> collect = new HashSet<>();
            for (Map.Entry<String, Integer> entry : helper.entrySet()) {
                if (entry.getValue().equals(i)) {
                    collect.add(entry.getKey());
                }
            }
            result.put(i,collect);
        }
        return result;

    }
}
