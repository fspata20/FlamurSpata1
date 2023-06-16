package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);


        List<String> sortedNames = names.stream()
                .sorted()
                .toList();
        System.out.println("Sorted names: " + sortedNames);


        List<String> namesStartingWithE = names.stream()
                .filter(name -> name.startsWith("E"))
                .toList();
        System.out.println("Names starting with 'E': " + namesStartingWithE);


        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number > 30 && number < 200)
                .toList();
        System.out.println("Filtered numbers: " + filteredNumbers);


        List<String> namesUppercase = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Names in uppercase: " + namesUppercase);


        List<String> modifiedNames = names.stream()
                .map(name -> name.substring(1, name.length() - 1))
                .sorted()
                .toList();
        System.out.println("Modified names: " + modifiedNames);


        List<String> reversedNames = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Reversed names: " + reversedNames);
    }
}
