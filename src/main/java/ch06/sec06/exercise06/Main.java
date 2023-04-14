package ch06.sec06.exercise06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> src = List.of("one", "two", "three");
        List<String> dest = new ArrayList<>();
        copyElements(src, dest);
        System.out.println(dest);

        List<Integer> src2 = List.of(1,2,3,4,5);
        List<Integer> dest2 = new ArrayList<>();
        copyElements2(src2, dest2);
        System.out.println(dest2);
    }
    public static <T> void copyElements(List<? extends T> src, List<T> dest) {
        for (T e : src) {
            dest.add(e);
        }
    }
    public static <T> void copyElements2(List<T> src, List<? super T> dest) {
        for (T e : src) {
            dest.add(e);
        }
    }
}