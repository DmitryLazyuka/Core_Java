package ch04.sec04.exercise01;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
//        System.out.println("DB".hashCode());
//        System.out.println("Ca".hashCode());

        LabeledPoint lp = new LabeledPoint("label1",5,6);
        System.out.println(lp);
        System.out.println(lp.x);


    }
}
