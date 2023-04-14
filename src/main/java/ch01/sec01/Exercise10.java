package ch01.sec01;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Random rand = new Random();
        long number = Math.abs(rand.nextLong());
        System.out.println(Long.toString(number,36));
    }
}