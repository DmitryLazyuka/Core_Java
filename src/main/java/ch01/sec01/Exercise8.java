package ch01.sec01;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String result = s.substring(i, j);
                if (!result.equals(s) && !result.trim().isEmpty()) {
                    System.out.println(result);
                }
            }
        }
    }
}