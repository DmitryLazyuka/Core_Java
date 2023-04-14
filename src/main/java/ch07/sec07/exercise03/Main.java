package ch07.sec07.exercise03;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

//        Union
//        set1.addAll(set2);
//        System.out.println(set1);

//        Intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

//        Difference
//        set1.removeAll(set2);
//        System.out.println(set1);
    }
}
