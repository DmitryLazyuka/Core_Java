package ch06.sec06.exercise07;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(2, 5);
        System.out.println(pair.getFirst());
        System.out.println("Max is " + pair.getMax());
        System.out.println("Min is " + pair.getMin());
    }
}