package org.iesvdm.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Set<Integer>> list = new ArrayList<>();

        System.out.println("Enter lines of integers (end input with an empty line):");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            Set<Integer> set = Arrays.stream(line.split("\\s+"))
                    .filter(s -> s.matches("-?\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());
            list.add(set);
        }

        list.forEach(set -> {
            set.forEach(System.out::println);
        });
    }
}
