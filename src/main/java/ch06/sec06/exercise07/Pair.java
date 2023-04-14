package ch06.sec06.exercise07;

public class Pair<E extends Comparable<E>> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }
    public E getFirst() {
        return first;
    }
    public E getSecond() {
        return second;
    }

    public E getMax() {
        if (first.compareTo(second) >= 0) {
            return first;
        } else
            return second;
        }
    public E getMin() {
        if (first.compareTo(second) <= 0) {
            return first;
        } else
            return second;
    }
}