package ch02.sec02;

public class Exercise5 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1,3).scale(0.5);
        System.out.println(p);
    }
}