package day2;
import java.util.Scanner;
public class CommaToMakarena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        convertComma(text);
    }
    static void convertComma(String text){
        String newText;
        newText = text.replace(",", "-MAKARENA");
        System.out.println(newText);
    }
}