package org.iesvdm.exercises;

import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {

        Comparator<List<Integer>> byLengthAndSum = Comparator.<List<Integer>>comparingInt(List::size)
                .thenComparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());


        Comparator<List<Integer>> bySumAndLength = Comparator.<List<Integer>>comparingInt(list ->
                        list.stream().mapToInt(Integer::intValue).sum())
                .thenComparingInt(List::size);

        Set<List<Integer>> lengthSumTreeSet = new TreeSet<>(byLengthAndSum);
        Set<List<Integer>> sumLengthTreeSet = new TreeSet<>(bySumAndLength);

        lengthSumTreeSet.add(Arrays.asList(1, 2, 3));
        lengthSumTreeSet.add(Arrays.asList(4, 5));
        lengthSumTreeSet.add(Arrays.asList(6, 7, 8, 9));

        sumLengthTreeSet.addAll(lengthSumTreeSet);

        // Output results
        System.out.println("TreeSet by Length and Sum: " + lengthSumTreeSet);
        System.out.println("TreeSet by Sum and Length: " + sumLengthTreeSet);
    }
}
