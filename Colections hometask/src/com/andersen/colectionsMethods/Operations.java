package com.andersen.colectionsMethods;

import java.util.List;
import java.util.Set;

public interface Operations {
    boolean equals (Set a, Set b);
    Set union (Set a, Set b);
    Set subtract (Set a, Set b);
    Set intersect (Set a, Set b);
    Set symmetricSubtract(Set a, Set b);
}
