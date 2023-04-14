package ch02.sec02;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //accessor method
        scanner.nextInt();

        Random random = new Random();
        //mutator method
        random.nextInt();
        random.nextInt();

    }
}