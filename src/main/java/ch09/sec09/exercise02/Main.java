package ch09.sec09.exercise02;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

/*Write a program that reads a text file and produces a file with the same
name but extension .toc, containing an alphabetized list of all words in
the input file together with a list of line numbers in which each word
occurs. Assume that the file’s encoding is UTF-8.*/
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IdeaProjects\\Invoices\\test\\src\\main\\java\\ch09\\sec09\\exercise02\\Text");
        produceFile(file);
    }

    public static void produceFile(File file) throws IOException {
        String newPath = file.getAbsolutePath() + "2";
        Map<String, Set<Integer>> map = countWords(file);
        String convertedMap = convertMapToString(map);
        try (FileWriter fw = new FileWriter(newPath)) {
            fw.write(convertedMap);
            fw.flush();
        }
    }
    private static Map<String, Set<Integer>> countWords(File file) {
        Set<Integer> lineNumbers;
        Map<String, Set<Integer>> map = new TreeMap<>();

        List<String> lines;
        try {
            lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int index = 0; index < lines.size(); index++) {
            String[] words = lines.get(index).split(" ");
            for (String word : words) {
                String wordWithoutPunctuation = word.replaceAll("[!,.:;?]", "");
                lineNumbers = map.containsKey(wordWithoutPunctuation) ? map.get(word) : new HashSet<>();
                lineNumbers.add(index + 1);
                map.put(wordWithoutPunctuation, lineNumbers);
            }
        }
        return map;
    }

    private static String convertMapToString(Map<String, Set<Integer>> map) {
        StringBuilder builder = new StringBuilder();
        for (String s : map.keySet()) {
            builder.append(s).append(" = ");
            Iterator<Integer> iter = map.get(s).iterator();

            for (Integer line : map.get(s)) {
                builder.append(line).append(", ");
            }
            builder.deleteCharAt(builder.length() - 2);
            builder.append("\n");
        }
        return builder.toString();
    }
}