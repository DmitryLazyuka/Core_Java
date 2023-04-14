package ch06.sec06.exercise09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,6,8,5,4,4);
        System.out.println(Arrays.firstLast(list));
        System.out.println("Min Value is " + Arrays.getMin(list));
        System.out.println("Max Value is " + Arrays.getMax(list));
        System.out.println("Min+Max Pair is "+ Arrays.minMax(list));
        List<Integer> result = new ArrayList<>();
        Arrays.minmax(list, Comparator.naturalOrder(), result);
        System.out.println(result);
    }
}
