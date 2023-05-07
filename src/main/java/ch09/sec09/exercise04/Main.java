package ch09.sec09.exercise04;

/*Using a Scanner is convenient, but it is a bit slower than using a
BufferedReader. Read in a long file a line at a time, counting the
number of input lines, with (a) a Scanner and
hasNextLine/nextLine, (b) a BufferedReader and
readLine, (c) a BufferedReader and lines. Which is the fastest?
The most convenient?*/

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\IdeaProjects\\Invoices\\test\\src\\main\\java\\ch09\\sec09\\exercise04\\war_and_peace.txt");
        long startTime = System.currentTimeMillis();
        System.out.println("(a) a Scanner and hasNextLine/nextLine");
        System.out.println(countWithScanner(file));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Time: " + duration + " ms");
        System.out.println("=========================");

        startTime = System.currentTimeMillis();
        System.out.println("(b) a BufferedReader and readLine");
        System.out.println(countWithBufferedReader(file));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Time: " + duration + " ms");
        System.out.println("=========================");

        startTime = System.currentTimeMillis();
        System.out.println("(c) a BufferedReader and lines");
        System.out.println(countWithBRLines(file));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Time: " + duration + " ms");
    }
    public static Long countWithScanner(File file) {
        try {
            Long numberOfLines = 0L;
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                numberOfLines++;
                sc.nextLine();
            }
            return numberOfLines;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Long countWithBufferedReader(File file) {
        try {
            Long numberOfLines = 0L;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                br.readLine();
                numberOfLines++;
            }
            return numberOfLines;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Long countWithBRLines(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.lines().count();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
