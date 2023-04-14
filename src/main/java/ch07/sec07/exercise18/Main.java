package ch07.sec07.exercise18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        List strings = Collections.checkedList(integers, Integer.class);
        strings.add("qwerty");
        System.out.println(strings);
    }
}
