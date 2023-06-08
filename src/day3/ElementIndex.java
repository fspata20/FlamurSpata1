package day3;

import java.util.Scanner;

public class ElementIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        if(findIndex(nr)>-1)
            System.out.println(findIndex(nr));
        else
            System.out.println("Number not found on the array.");

    }
    static int findIndex(int nr){
        int[] arr = new int[]{1, 7, 3, 10, 9};
        for(int i = 0; i< arr.length ; i++) {
            if (arr[i] == nr)
                return i;
        }
        return -1;
    }
}
