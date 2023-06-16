package day5exceptions;

import java.util.Scanner;

public class PrintValueOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(input);
            System.out.println("int -> " + intValue);
        } catch (NumberFormatException e1) {
            try {
                double doubleValue = Double.parseDouble(input);
                System.out.println("double -> " + doubleValue);
            } catch (NumberFormatException e2) {
                System.out.println("Hey! That's not a value! Try once more.");
            }
        }
    }
}

