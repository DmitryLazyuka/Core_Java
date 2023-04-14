package ch07.sec07.exercise08;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/main/java/ch07/sec07/exercise08/Text"); // replace filename.txt with the name of your file
        Map<String, Set<Integer>> wordOccurrence = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                String[] words = line.split(" ");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        Set<Integer> lineNums = wordOccurrence.getOrDefault(word, new HashSet<>());
                        lineNums.add(lineNum);
                        wordOccurrence.put(word, lineNums);
                    }
                }
            }

            for (Map.Entry<String, Set<Integer>> entry : wordOccurrence.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
    }
}