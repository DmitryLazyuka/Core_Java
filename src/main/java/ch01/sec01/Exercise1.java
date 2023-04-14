package ch01.sec01;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some int number: ");
        int number = scanner.nextInt();
        System.out.println("Binary: " + Integer.toString(number,2));
        System.out.println("Octal: " + Integer.toString(number,8));
        System.out.println("Hexadecimal: " + Integer.toString(number,16));
        System.out.println("Reciprocal hex float: " + Double.toHexString(1.0/number));
    }
}
