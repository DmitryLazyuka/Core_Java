package ch03.sec03.sec5;

public class Main {
    public static void main(String[] args) {


        MyInterface<String> myInterface = (str) -> System.out.println(str);
        myInterface.print("Hello");
    }
}
