package ch02.sec02;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread.start();
    }
}
