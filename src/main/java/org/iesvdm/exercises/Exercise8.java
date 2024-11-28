package org.iesvdm.exercises;

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream().mapToInt(Integer::intValue).sum());

        Set<List<Integer>> lengthTreeSet = new TreeSet<>(byLength);
        Set<List<Integer>> sumTreeSet = new TreeSet<>(bySum);

        lengthTreeSet.add(Arrays.asList(1, 2, 3));
        lengthTreeSet.add(Arrays.asList(4, 5));
        lengthTreeSet.add(Arrays.asList(6, 7, 8, 9));

        sumTreeSet.addAll(lengthTreeSet);

        System.out.println("TreeSet by Length: " + lengthTreeSet);
        System.out.println("TreeSet by Sum: " + sumTreeSet);
    }
}
