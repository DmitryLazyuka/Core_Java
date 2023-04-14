package ch08.sec08.exercise12;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> words = Stream.of("Lorem", "ipsum", "dolor", "sit", "amet");
        int max = words.mapToInt(String::length).max().orElse(100);
        Stream<String> words2 = Stream.of("Lorem", "ipsum", "dolor", "sit", "amet");
        List<String> result = words2.filter(e -> e.length() == max).toList();
        System.out.println(result);
    }
}