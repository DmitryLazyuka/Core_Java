package ch02.sec02;

public class Exercise10 {
    public static void main(String[] args) {
        Car car = new Car(10,50);
        car.drive(400);
        System.out.println("The distance from origin is " + car.getDistance());
        System.out.println("The gas level is " + car.getGasLevel());
        car.drive(200);
        System.out.println("The distance from origin is " + car.getDistance());
        car.gasFilling(20);
        System.out.println("The gas level is " + car.getGasLevel());
        car.drive(100);
        System.out.println("The distance from origin is " + car.getDistance());
    }
}