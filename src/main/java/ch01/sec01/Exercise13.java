package ch01.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {
    private static int x = 0;
    private static int y = 0;

    public static void main(String[] args) {
        boolean isExit = false;
        while (!isExit) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the direction (W, N, E, S): ");
            String s = scanner.nextLine();
            switch (s.toUpperCase()) {
                case "N" -> {
                    y = (y > 0) ? 1 : (y + 1);
                    System.out.printf("Your direction is [%d,%d]", x, y);
                }
                case "W" -> {
                    x = (x < 0) ? -1 : (x - 1);
                    System.out.printf("Your direction is [%d,%d]", x, y);
                }
                case "S" -> {
                    y = (y < 0) ? -1 : (y - 1);
                    System.out.printf("Your direction is [%d,%d]", x, y);
                }
                case "E" -> {
                    x = (x > 0) ? 1 : (x + 1);
                    System.out.printf("Your direction is [%d,%d]", x, y);
                }
                default -> {
                    System.out.println("Unknown direction");
                    isExit = true;
                }
            }
        }
    }
}