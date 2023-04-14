package ch08.sec08.exercise11;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Stream.of("Lorem", "ipsum", "dolor", "sit", "amet")
                .mapToInt(String::length)
                .average());
    }
}
