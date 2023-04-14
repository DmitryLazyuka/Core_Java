package ch01.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise19 {
    private static int sum;
    private static List<List<Integer>> lines = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two-dimensional array: ");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            List<Integer> row = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            lines.add(row);
        }

        sum = lines.get(0).stream().mapToInt(x -> x).sum();

        if (isLinesSumEquals() && isRowsSumEquals() && isDiagonalSumEquals()) {
            System.out.println("Its a MAGIC SQUARE");
        } else {
            System.out.println("Its not a magic square");
        }
    }

    private static boolean isLinesSumEquals() {
        for (int i = 1; i < lines.size(); i++) {
            int tempSum = lines.get(i).stream().mapToInt(x -> x).sum();
            if (tempSum != sum) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRowsSumEquals() {
        int tempSum = 0;
        for (int row = 0; row < lines.size(); row++) {
            for (int column = 0; column < lines.size(); column++) {
                tempSum += lines.get(row).get(column);
            }
            if (tempSum != sum) {
                return false;
            }
            tempSum = 0;
        }
        return true;
    }

    private static boolean isDiagonalSumEquals() {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < lines.size(); i++) {
            leftDiagonalSum += lines.get(i).get(i);
            rightDiagonalSum += lines.get(lines.size() - 1 - i).get(lines.size() - 1 - i);
        }
        return (leftDiagonalSum == sum) && (rightDiagonalSum == sum);
    }
}
