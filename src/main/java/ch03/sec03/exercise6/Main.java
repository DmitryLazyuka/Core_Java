package ch03.sec03.exercise6;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Sequence<Integer> sequenceInt = new SquareSequenceInt(1567);

        Sequence<BigInteger> sequence = new SquareSequence(BigInteger.valueOf(1567));


        while(sequenceInt.hasNext()){
            System.out.println(sequenceInt.next());
            if (sequenceInt.next() < 0) {
                System.out.println("Integer overflow");
                break;
            }
        }
    }
}
