package ch01.sec01;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        System.out.println("Введите номер месяца: ");


        while (!isExit) {
            int numberOfMonth = scanner.nextInt();
            switch (numberOfMonth) {
                case 12, 1, 2 -> System.out.println("Winter");
                case 3, 4, 5 -> System.out.println("Spring");
                case 6, 7, 8 -> System.out.println("Summer");
                case 9, 10, 11 -> System.out.println("Fall");
                default -> {
                    System.out.println("No such month in the year");
                    isExit = true;
                }
            }
        }
    }
}