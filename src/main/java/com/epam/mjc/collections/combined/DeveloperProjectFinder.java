package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if(entry.getValue().contains(developer)){
                result.add(entry.getKey());
            }
        }

        result.sort(Comparator.comparing(String::length).reversed().thenComparing(Comparator.reverseOrder()));

        return result;
    }
}
