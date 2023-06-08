package day2;

import java.util.Scanner;

public class InvertedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String newText = "";
        char ch;
        for(int i = 0 ; i < text.length() ; i++){
            ch = text.charAt(i);
            newText = ch + newText;
        }
        System.out.println("Reversed string is: " + newText);
    }
}
