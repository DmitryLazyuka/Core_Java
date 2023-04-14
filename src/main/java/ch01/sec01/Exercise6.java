package ch01.sec01;

import java.math.BigInteger;

public class Exercise6 {
    public static void main(String[] args) {
        int number = 100;
        BigInteger bi = BigInteger.valueOf(1);

        for (int i = number; i > 1; i--) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
    }
}