package day3;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 17, 3, 10, 9,20,90,8,2};
        int min = 9999, max = -9999;
        int indexMin = 0, indexMax = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
            if(arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        System.out.println("Max: " + max + " index: " + indexMax);
        System.out.println("Min: " + min + " index: " + indexMin);
    }
}
