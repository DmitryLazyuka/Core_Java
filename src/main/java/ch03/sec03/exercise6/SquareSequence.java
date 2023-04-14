package ch03.sec03.exercise6;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger i;

    public SquareSequence(BigInteger i) {
        this.i = i;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        i = i.add(BigInteger.ONE);
        return i.multiply(i);
    }
}