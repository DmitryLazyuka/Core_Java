package ch05.sec05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise05 {
    public static void writeToFile(String inputFilename, String outputFilename) {
        Scanner in = null;
        PrintWriter out = null;
        try {
            File inputFile = new File(inputFilename);
            in = new Scanner(inputFile);
            out = new PrintWriter(outputFilename);

            while (in.hasNext()) {
                String line = in.nextLine();
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    System.err.println("Error closing input file: " + e.getMessage());
                }
            }
            if (out != null) {
                out.close();
                if (out.checkError()) {
                    System.err.println("Error writing to output file.");
                }
            }
        }
    }
}