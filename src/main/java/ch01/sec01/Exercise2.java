package ch01.sec01;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle value: ");
        int angle = scanner.nextInt();
        System.out.println("C использованием % оператора - " + operatorNormalization(angle));
        System.out.println("C использованием floorMod() метода - " + floorModNormalization(angle));
    }
    public static int operatorNormalization(int value) {
        return Math.abs(value) % 360;
    }
    public static int floorModNormalization(int value) {
        return Math.floorMod(value, 360);
    }
}
