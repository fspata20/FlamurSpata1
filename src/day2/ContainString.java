package day2;

import java.util.Scanner;

public class ContainString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord, secondWord;
        firstWord = input.nextLine();
        secondWord = input.nextLine();
        System.out.println(containsWord(firstWord, secondWord));

    }
    static boolean containsWord(String firstWord, String secondWord){
        return firstWord.contains(secondWord);
    }
}
