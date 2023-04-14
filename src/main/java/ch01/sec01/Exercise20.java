package ch01.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();


        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(1);
        result.add(pre);

        for (int i = 2; i <= numberOfRows; i++) {
            ArrayList<Integer> cur = new ArrayList<>();

            cur.add(1);
            for (int j = 0; j < pre.size() - 1; j++) {
                cur.add(pre.get(j) + pre.get(j + 1));
            }
            cur.add(1);

            result.add(cur);
            pre = cur;
        }

        for (List<Integer> integers : result) {
            for (Integer integer : integers) {
                System.out.printf("%4d", integer);
            }
            System.out.println();
        }
    }
}