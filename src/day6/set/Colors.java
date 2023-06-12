package day6.set;

import java.util.HashSet;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        HashSet<String> newSet = new HashSet<>();
        printElements(newSet);
        removeElement(newSet);
    }

    static void printElements(HashSet<String> set){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color \n exit when you are finished: ");
        String element = input.nextLine();
        while ( !element.equalsIgnoreCase("exit")){
            set.add(element);
            element = input.next();
        }
        System.out.println(set);
    }
    static void removeElement(HashSet<String> newSet) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the color you want to delete: (exit if you finished)");
        String element = input.next();
        while (!element.equalsIgnoreCase("exit")) {
            newSet.remove(element);
            System.out.println("Colors left: " + newSet);
            element = input.next();
        }
        System.out.println("After deleting: " + newSet);

    }
}
