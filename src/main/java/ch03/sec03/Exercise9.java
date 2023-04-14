package ch03.sec03;

public class Exercise9 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Greeter(10, "Ben"));
        Thread thread2 = new Thread(new Greeter(20, "Cao"));

        thread1.start();
        thread2.start();
    }
}
class Greeter implements Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++){
            System.out.println("Hello, " + target);
        }
    }
}
