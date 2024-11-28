package org.iesvdm.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<List<Integer>> hashSet = new HashSet<>();

        System.out.println("Enter lines of integers (end input with an empty line):");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            List<Integer> list = Arrays.stream(line.split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            hashSet.add(list);
        }

        hashSet.forEach(list -> {
            list.forEach(System.out::println);
        });
    }
}
