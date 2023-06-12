package day6.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPurchasing {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Purchasing
        purchasedProducts(list);

        //Deleting
        deleteElement(list);

        //Display elements starting with m
        startWithM(list);


        //Display elements whose next product starts with m
        nextStartWithM(list);
    }


    static void purchasedProducts(List<String> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product you want to purchase(finish if you finished). \n");
        String element = input.nextLine();

        while (!element.equalsIgnoreCase("finish")) {
            if (!list.contains(element)) {
                list.add(element);
                System.out.println(element + " added to the list!");
            } else {
                System.out.println("This element already exists on the list.");
            }
            element = input.next();
        }
    }

    static void deleteElement(List<String> list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a purchase that you want to delete: (if you dont want" +
                " to delete enter \"no\")");
        String element;
        element = input.next();

        while (!element.equalsIgnoreCase("no")) {
            if (list.contains(element)) {
                list.remove(element);
                System.out.println(element + " is removed form the list!");
            } else System.out.println("Element not found on the list! ");

            System.out.println("Do you want to continue deleting? ");
            element = input.next();
        }
    }

    static void nextStartWithM(List<String> list){
        System.out.println("Elements whose next starts with m: ");
        for (int i = 0; i < list.size() - 1; i++) {
            String currentPurchase = list.get(i);
            String nextPurchase = list.get(i + 1);
            if (currentPurchase.startsWith("m") ) {
                System.out.println(nextPurchase);
            }
        }
    }
    static void startWithM(List<String> list){
        System.out.println("Elements starting with m: ");
        for (String purchase : list) {
            if (purchase.startsWith("m"))
                System.out.println(purchase);
        }
    }
}
