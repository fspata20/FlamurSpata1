package day8;

import java.util.Arrays;
import java.util.List;

public class UsingLambda {
    public static void main(String[] args) {
        calculatingWithLambda addition = Integer::sum;
        System.out.println("Addition: " + addition.calculate(5, 3));

        calculatingWithLambda subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(8, 2));

        calculatingWithLambda multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(4, 6));

        calculatingWithLambda division = (a, b) -> {
            if (b != 0)
                return a / b;
            else
                throw new ArithmeticException("Division by zero!");
        };
        System.out.println("Division: " + division.calculate(10, 2));


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of elements: " + sum);


        List<String> words = Arrays.asList("Hello", "world", "lambda", "expressions");
        double wordCount = (long) words.size();
        System.out.println("Number of words: " + wordCount);
    }

    interface calculatingWithLambda {
        int calculate(int a, int b);
    }
}
