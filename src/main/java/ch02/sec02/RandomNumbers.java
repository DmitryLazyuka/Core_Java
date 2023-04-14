package ch02.sec02;

import java.util.List;
import java.util.Random;

public class RandomNumbers {
    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
        // Ok to access the static generator variable
    }

    public static int randomElement(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int index = nextInt(0, array.length - 1);
        return array[index];
    }

    public static int randomElement(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(nextInt(0, list.size() - 1));
    }
}