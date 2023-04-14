package ch03.sec03.exercise6;

public class SquareSequenceInt implements Sequence<Integer> {
    private int i;
    public SquareSequenceInt(int i) {
        this.i = i;
    }
    public boolean hasNext() {
        return true;
    }

    public Integer next() {
        i++;
        return i * i;
    }
}