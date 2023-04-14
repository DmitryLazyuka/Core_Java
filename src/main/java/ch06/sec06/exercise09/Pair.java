package ch06.sec06.exercise09;

public class Pair<E> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public E getFirst() {
        return first;
    }
    public E getSecond() {
        return second;
    }
}