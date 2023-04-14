package ch06.sec06.exercise05;

public class Main {
    public static void main(String[] args) {
        Double[] result = Main.swap(0, 1, 1.5, 2.0, 3.0);
    }
    public static <T> T[] swap(int i, int j, T...values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}