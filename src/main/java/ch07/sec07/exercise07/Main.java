package ch07.sec07.exercise07;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:/IdeaProjects/Invoices/test/src/main/java/ch07/sec07/exercise07/Sentence"))) {
            List<String> list = new ArrayList<>();
            Collections.addAll(list, reader.readLine().split(" "));
            Map<String, Integer> map = new TreeMap<>();
            for (String s : list) {
//                map.merge(s, 1, Integer::sum);

//                Exercise 9a
//                if (map.keySet().contains(s)) {
//                    map.put(s, map.get(s) + 1);
//                } else {
//                    map.put(s, 1);
//                }

//                Exercise9b
//                Integer count = map.get(s);
//                if (count != null) {
//                    map.put(s, count + 1);
//                } else {
//                    map.put(s, 1);
//                }

//                Exercise 9c
//                map.put(s, map.getOrDefault(s, 0) + 1);

//                Exercise 9d
//                map.putIfAbsent(s, 0);
//                map.put(s, map.get(s) + 1);
            }
            System.out.println(map);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}