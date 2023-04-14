package ch02.sec02;

import java.util.ArrayList;
import java.util.List;

public class Exercise11 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(RandomNumbers.randomElement(array));

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(RandomNumbers.randomElement(list));
    }
}