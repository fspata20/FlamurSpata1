package day3;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = random.nextInt(41);
        }
        System.out.println("Array at the beginning: ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 1 ; i < arr.length-1 ; i++){
            arr[i] = arr[i+1];
            if(i == arr.length-2){
                arr[i+1]=0;
            }
        }

        System.out.println("Array after removing the element on index 1: ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
