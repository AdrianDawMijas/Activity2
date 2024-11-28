package org.iesvdm.exercises;

import java.util.*;

public class Exercise2HashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words:");
        String[] words = scanner.nextLine().split("\\s+");

        Set<String> hashSet = new HashSet<>(Arrays.asList(words));
        hashSet.forEach(System.out::println);
    }
}
