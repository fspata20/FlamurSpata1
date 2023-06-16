package day4.GroceryShopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Products[] products = new Products[5];
        int i = 0;
        products[0] = new Products("Milk", 220);
        products[1] = new Products("Lays", 60);
        products[2] = new Products("Moltos", 100);
        products[3] = new Products("Water", 50);
        products[4] = new Products("Caffee", 170);
        Products[] cart = new Products[5];
        System.out.println("Welcome to our shop! What product do you want to buy? ");
        while(i<5){
            String product = input.nextLine();
            if (product.equals("exit")) {
                break;
            }
            boolean flag = false;
            for(Products p:products){

                if(product.equals(p.getName())){
                    cart[i] = new Products(p.getName(),p.getprice());
                    i++;
                    System.out.println(p.getName()+" is added to the cart!");
                    flag = true;
                }

            }
            if(!flag){
                System.out.println(product + " was not found!");
            }
        }
        input.close();
        System.out.print("You should pay : ");
        double price = 0 ;
        for (Products p1:cart){
            price+=p1.getprice();
        }
        System.out.print(price);
    }
}
