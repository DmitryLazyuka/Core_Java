package ch01.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        boolean isExit = false;

        while (!isExit) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the direction (W, N, E, S): ");
            String s = scanner.nextLine();

            int[] direction = switch (s.toUpperCase()) {
                case "N" -> new int[]{0, 1};
                case "W" -> new int[]{-1, 0};
                case "S" -> new int[]{0, -1};
                case "E" -> new int[]{1, 0};
                default -> {
                    System.out.println("Unknown direction");
                    isExit = true;
                    yield new int[]{0, 0};
                }
            };
            System.out.println(Arrays.toString(direction));
        }

    }
}
