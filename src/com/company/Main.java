package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        System.out.println(set1);
        System.out.println();


        Set<Integer> set2 = new LinkedHashSet();
        set2.add(8);
        set2.add(3);
        set2.add(1);
        set2.add(5);
        System.out.println(set2);
        System.out.println(symmetricDifference(set1, set2));

    }


    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        Set<Integer> set4 = new HashSet<>(set1);
        set4.retainAll(set2);
        set3.removeAll(set4);
        System.out.println();
        return set3;

    }
}