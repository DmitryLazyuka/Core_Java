package ch07.sec07.exercise13;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new Cache<>(3);
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        System.out.println(map);
        map.put(4,"4");
        System.out.println(map);
    }
}