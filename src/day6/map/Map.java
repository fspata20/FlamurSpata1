package day6.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Person> newMap = new HashMap<>();

        int i = 0;
        while (i < 2) {
            System.out.println("Name: ");
            String name = input.next();
            System.out.println("Surname: ");
            String surname = input.next();
            System.out.println("Age: ");
            int age = input.nextInt();
            List<String> friends = new ArrayList<>();

            for (int j = 1; j <= 2; j++) {
                System.out.println("Name of friend " + j + ": ");
                String firstName = input.next();
                friends.add(firstName);
            }
            newMap.put(i, new Person(name, surname, age, friends));
            i++;
        }

        for (int c = 0; c < newMap.size(); c++) {
            System.out.println(newMap.get(c));
        }
    }
}
