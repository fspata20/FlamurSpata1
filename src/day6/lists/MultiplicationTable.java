package day6.lists;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public static void main(String[] args) {
        int maxNumber = 9;

        List<List<Integer>> tables = new ArrayList<>();

        for (int i = 1; i <= maxNumber; i++) {
            List<Integer> table = new ArrayList<>();

            for (int j = 1; j <= maxNumber; j++) {
                table.add(i * j);
            }

            tables.add(table);
        }

        for (List<Integer> table : tables) {
            for (int value : table) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
