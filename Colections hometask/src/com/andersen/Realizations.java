package com.andersen;

import com.andersen.colectionsMethods.Operations;

import java.util.HashSet;
import java.util.Set;

public class Realizations implements Operations {


    @Override
    public boolean equals(Set a, Set b) {
        return a.equals(b);
    }

    @Override
    public Set union(Set a, Set b) {
        Set<String> unionSet = new HashSet<>();
        unionSet.addAll(a);
        unionSet.addAll(b);
        return unionSet;
    }

    @Override
    public Set subtract(Set a, Set b) {
        Set<String> subtractSet = new HashSet<>();
        subtractSet.addAll(a);
        subtractSet.removeAll(b);
        return subtractSet;
    }

    @Override
    public Set intersect(Set a, Set b) {
        Set<String> intersectSet = new HashSet<>();
        intersectSet.addAll(a);
        intersectSet.retainAll(b);
        return intersectSet;
    }

    @Override
    public Set symmetricSubtract(Set a, Set b) {
        Set<String> newSubstractSetA = new HashSet<>();
        newSubstractSetA.addAll(a);
        newSubstractSetA.removeAll(b);

        Set<String> newSubstractSetB = new HashSet<>();
        newSubstractSetB.addAll(b);
        newSubstractSetB.removeAll(a);

        Set<String> symmetricSubstractSet = new HashSet<>();
        symmetricSubstractSet.addAll(newSubstractSetA);
        symmetricSubstractSet.addAll(newSubstractSetB);
        return symmetricSubstractSet;
    }
}
