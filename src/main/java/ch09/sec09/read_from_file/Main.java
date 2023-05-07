package ch09.sec09.read_from_file;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\IdeaProjects\\Invoices\\test\\src\\main\\java\\ch09\\sec09\\exercise04\\war_and_peace.txt";

        try(BufferedReader bfr = new BufferedReader(new FileReader(fileName))) {
            Pattern pattern = Pattern.compile("\\bwar\\b/i", Pattern.CASE_INSENSITIVE);

            String line;
            int counter = 1;
            while ((line = bfr.readLine())!=null){
                if (line.toLowerCase().contains(" war ")){
                    System.out.println(counter + ". " + line.replaceAll("(?i)\\bwar\\b", "***WAR***"));
                    counter++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
