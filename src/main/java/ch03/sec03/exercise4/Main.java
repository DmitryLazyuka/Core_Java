package ch03.sec03.exercise4;

public class Main {
    public static void main(String[] args) {
//        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
//
//        while (sequence.hasNext()) {
//            System.out.println(sequence.next());
//        }

        IntSequence infinitySequence = IntSequence.constant(5);
        while (infinitySequence.hasNext()) {
            System.out.println(infinitySequence.next());
        }
    }
}