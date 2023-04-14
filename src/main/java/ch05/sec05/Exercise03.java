package ch05.sec05;

import static ch05.sec05.Exercise01_02.readValues;
import static ch05.sec05.Exercise01_02.sumOfValues;

public class Exercise03 {
    public static void main(String[] args) {
        String path = "C:/Users/User/Desktop/Doubles.txt";
        try {
            System.out.println(readValues(path));
            System.out.println(sumOfValues(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
