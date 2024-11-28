package org.iesvdm.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Exercise1{
    public static void main(String[] args) {
        int target = 24;
        Comparator<Integer> comparatorTarget = Comparator
                .comparingInt((Integer o) -> Math.abs(o - target))
                .thenComparingInt(o -> o);
        ArrayList<Integer> list = new ArrayList<>(List.of(11, 2, 13, 4, 25, 6, 71, 8));
        list.stream().sorted(comparatorTarget).forEach(System.out::println);
        TreeSet<Integer> treeSet = new TreeSet<>(comparatorTarget);
        treeSet.addAll(list);
        System.out.println(treeSet);
    }
}
