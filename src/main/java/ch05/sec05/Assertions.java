package ch05.sec05;

public class Assertions {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        print(-10);
    }

    public static void print(int i) {

        assert i > 0;
        System.out.println(i);
    }
}
