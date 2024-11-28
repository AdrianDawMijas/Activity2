package org.iesvdm.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        HashSet<List<Integer>> hashSet = new HashSet<>();
        hashSet.add(Arrays.asList(1, 2, 3));
        hashSet.add(Arrays.asList(4, 5));
        hashSet.add(Arrays.asList(6, 7, 8, 9));

        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        List<Integer> longestList = Collections.max(hashSet, byLength);
        List<Integer> highestSumList = Collections.max(hashSet, bySum);

        System.out.println("Longest List: " + longestList);
        System.out.println("Highest Sum List: " + highestSumList);
    }
}
