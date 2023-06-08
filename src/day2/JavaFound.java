package day2;
import java.util.Scanner;
public class JavaFound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        checkWord(word);
    }
    static void checkWord(String word) {
        if(word.contains("Java")){
            System.out.println("Found Java");
            if(word.startsWith("Java"))
                System.out.println("Start with Java!");
            if(word.endsWith("Java"))
                System.out.println("Ends with Java!");
            if(word.equals("Java"))
                System.out.println("Equals Java");
        }
    }
}
