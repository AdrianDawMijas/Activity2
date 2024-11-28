package org.iesvdm.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise6 {
    public static List<Integer> findLongestList(HashSet<List<Integer>> hashSet) {
        return hashSet.stream()
                .reduce((a, b) -> a.size() > b.size() ? a : b)
                .orElse(new ArrayList<>());
    }

    public static void main(String[] args) {
        HashSet<List<Integer>> hashSet = new HashSet<>();
        hashSet.add(Arrays.asList(1, 2, 3));
        hashSet.add(Arrays.asList(4, 5));
        hashSet.add(Arrays.asList(6, 7, 8, 9));

        List<Integer> longestList = findLongestList(hashSet);
        System.out.println("Longest List: " + longestList);
    }
}
