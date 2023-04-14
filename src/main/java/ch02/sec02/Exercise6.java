package ch02.sec02;

public class Exercise6 {
    public static void main(String[] args) {
        Point2 p = new Point2(3, 4);
        p.translate(1,3);
        p.scale(0.5);
        System.out.println(p);
    }
}
