package ch07.sec07.exercise14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        map.put(2, "NEW");
        map.put(5, "E");
        System.out.println(keys);
        System.out.println(values);
        System.out.println(entries);
    }
}
