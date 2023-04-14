package ch03.sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("cccccc","bb","aaa"));
        luckySort(list, String::compareTo);
//        luckySort(list, Comparator.comparingInt(String::length));
    }
    public static void luckySort(List<String> strings, Comparator<String> comp) {
        int iter = 0;

        ArrayList<String> sorted = new ArrayList<>(strings);
        sorted.sort(comp);
        System.out.println("sorted list: " + sorted);
        System.out.println("shuffled list: " + strings);

        while (!strings.equals(sorted)) {
            iter++;
            Collections.shuffle(strings);
            System.out.println("Iteration " + iter);
            System.out.println("sorted list: " + sorted);
            System.out.println("shuffled list: " + strings);
        }
    }
}