package ch01.sec01;

public class Exercise21 {
    public static void main(String[] args) {
        System.out.println(average(5.0));
        System.out.println(average(1.0,2.0,3.0));
        System.out.println(average(1.2,2.3,4.5,5.6,7.8,9.78));
    }

    public static double average(double first, double... values) {
        double sum = first;
        for (double v : values) sum += v;
        return values.length == 0 ? sum : sum /
                (values.length + 1);
    }
}
