package ch01.sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise18 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> resultNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i < 49; i++) {
            numbers.add(i);
        }
        int count = 0;
        while (count < 6) {
            int index = random.nextInt(numbers.size());
            int temp = numbers.get(index);
            numbers.remove(index);
            resultNumbers.add(temp);
            count++;
        }
        Collections.sort(resultNumbers);
        System.out.println("sort results" + resultNumbers);
    }
}
