package ch07.sec07.exercise02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("lorem", "ipsum", "dolor", "sit", "amet"));
        System.out.println(upperCaseWithIterator(words));
        System.out.println(upperCaseLoopByIndex(words));
        System.out.println(upperCaseWithReplaceAll(words));
    }

    public static List<String> upperCaseWithIterator(List<String> src) {
        List<String> dest = new ArrayList<>();
        Iterator<String> iter = src.listIterator();
        while (iter.hasNext()) {
            dest.add(iter.next().toUpperCase());
        }
        return dest;
    }

    public static List<String> upperCaseWithReplaceAll(List<String> src){
        src.replaceAll(String::toUpperCase);
        return src;
    }

    public static List<String> upperCaseLoopByIndex(List<String> src) {
        List<String> dest = new ArrayList<>();
        for(int i = 0; i < src.size(); i++){
            dest.add(i,src.get(i).toUpperCase());
        }
        return dest;
    }
}