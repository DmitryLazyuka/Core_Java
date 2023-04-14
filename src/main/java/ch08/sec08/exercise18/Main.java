package ch08.sec08.exercise18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\IdeaProjects\\Invoices\\test\\src\\main\\java\\ch08\\sec08\\exercise18\\war_and_peace.txt")));

        long startTime = System.currentTimeMillis();
        int n = 500;
        var longestWords = contents.lines().parallel()
                .flatMap(line -> {
                    String[] words = line.split("\\s+");
                    return Arrays.stream(words);
                })
                .filter(word -> word.length() > 0)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(n)
                .toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Found " + longestWords.size() + " longest words:");
        System.out.println(longestWords);
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }
}