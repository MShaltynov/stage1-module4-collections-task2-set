package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> finalList = new HashSet<>();
        for (Integer i : sourceList) {
            int a = i;
            while (true) {
                finalList.add(a);
                if (a % 2 == 1) {
                    a = a * 2;
                    finalList.add(a);
                    break;
                } else {
                    a = a / 2;
                }
            }
        }
        return finalList;
    }
}
