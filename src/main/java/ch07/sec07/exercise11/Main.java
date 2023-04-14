package ch07.sec07.exercise11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:/IdeaProjects/Invoices/test/src/main/java/ch07/sec07/exercise11/Sentence"))) {
            List<String> list = new ArrayList<>();
            Collections.addAll(list, reader.readLine().split(" "));
            System.out.println(list);
            System.out.println("Shuffled lists: ");
            for (int i = 0; i < 5; i++){
                Collections.shuffle(list.subList(1, list.size() - 1));
                System.out.println(list);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
