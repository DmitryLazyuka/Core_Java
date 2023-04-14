package ch01.sec01;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print("С использованием условного оператора - " + maxWithConditional(a, b, c));
        System.out.print("С использованием Math.max() - " + maxWithMathMax(a, b, c));
    }
    public static int maxWithConditional(int a, int b, int c) {
        int result = a > b ? a : b;
        return result > c ? result : c;
    }
    public static int maxWithMathMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
