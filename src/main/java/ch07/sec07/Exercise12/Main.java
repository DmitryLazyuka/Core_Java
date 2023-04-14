package ch07.sec07.Exercise12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> words = readFile("D:/IdeaProjects/Invoices/test/src/main/java/ch07/sec07/exercise12/Sentence");
        words.set(0, words.get(0).toLowerCase());
        String lastWord = words.get(words.size() - 1);
        String punctuation = findPunctuation(lastWord);
        words.set(words.size() - 1, lastWord.replace(punctuation, ""));
        Collections.shuffle(words);
        words.set(0, words.get(0).substring(0, 1).toUpperCase() + words.get(0).substring(1));
        words.set(words.size() - 1, words.get(words.size() - 1) + punctuation);
        String result = String.join(" ", words);
        System.out.println(result);
    }
    public static List<String> readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            List<String> list = new ArrayList<>();
            Collections.addAll(list, reader.readLine().split(" "));
            return list;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String findPunctuation(String word) {
        String punctuation = "";
        String regex = "[!,.;:]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            int punctuationIndex = matcher.start();
            punctuation = String.valueOf(word.charAt(punctuationIndex));
        }
        return punctuation;
    }
}