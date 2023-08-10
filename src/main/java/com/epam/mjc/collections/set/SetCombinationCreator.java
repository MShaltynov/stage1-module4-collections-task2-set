package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> strings = new HashSet<>();
        for (String string : firstSet) {
            if (secondSet.contains(string) && !thirdSet.contains(string)) {
                strings.add(string);
            }
        }
        for (String s : thirdSet) {
            if (!firstSet.contains(s) && !secondSet.contains(s)) {
                strings.add(s);
            }
        }
        return strings;
    }
}
