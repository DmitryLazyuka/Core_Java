package ch01.sec01;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        //example: ៩⇬֬8ÀkFGjkjक¹kjjk98µ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        s.chars().filter(x -> x > 128).forEach(x -> System.out.printf("%s - Unicode: \\u%04x %n", (char) x, x));
    }
}