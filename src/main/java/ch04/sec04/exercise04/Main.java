package ch04.sec04.exercise04;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle = new Circle(new Point(5,5),3);
        Shape rectangle = new Rectangle(new Point(0,10),20,10);
        Shape line = new Line(new Point(0,0), new Point(10,0));

        Shape[] shapes = new Shape[]{circle,rectangle,line};

        for (Shape shape : shapes) {
            System.out.println(shape.getCenter());
        }

        Circle copyCircle = ((Circle)circle).clone();
        copyCircle.point = new Point(1,1);
        System.out.println(copyCircle.point);
        System.out.println(circle.point);
    }
}
