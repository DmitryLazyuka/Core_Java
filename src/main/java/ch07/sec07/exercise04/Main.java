package ch07.sec07.exercise04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        Iterator<Integer> iter = list.iterator();
        list.add(2,3);
        iter.next();
    }
}
