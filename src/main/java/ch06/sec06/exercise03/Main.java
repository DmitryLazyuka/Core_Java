package ch06.sec06.exercise03;

public class Main {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();
        table.add(1, "a");
        table.add(2, "b");
        table.add(3, "c");
        table.add(4, "d");

        System.out.println(table.getValue(3));
        table.putValue(3, "AAA");
        System.out.println(table.getValue(3));
        table.removeKey(2);
    }
}