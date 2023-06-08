package day3;
public class OccurrencesOfNr {
    public static void main(String[] args) {
        int[] numbers = new int[]{6 ,5 ,4 ,5 ,10 ,5 ,8 ,3 ,10 ,6 ,6 ,6 ,4 ,3 ,2 ,8 ,1 ,3 ,4 ,7};
        int[] countArray = new int[11];

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            countArray[num]++;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + countArray[i]);
        }
    }

}
