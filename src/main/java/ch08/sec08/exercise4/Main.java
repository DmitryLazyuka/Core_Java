package ch08.sec08.exercise4;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        infiniteStream(25214903917L, 11, 248);
    }
    public static void infiniteStream(Long a, int c, int m){
        LongStream.iterate(0, x-> (a * x + c) % m).forEach(System.out::println);
    }
}
