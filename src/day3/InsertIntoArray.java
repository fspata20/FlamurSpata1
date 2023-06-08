package day3;

import java.util.Arrays;
import java.util.Scanner;
public class InsertIntoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 7, 3, 10, 9};
        int element = input.nextInt();
        int position = input.nextInt();

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));

        int[] newArray = new int[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }
        array = newArray;
        System.out.println("New Array: ");
        System.out.println(Arrays.toString(array));
    }
}
