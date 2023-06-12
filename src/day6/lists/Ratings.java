package day6.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ratings {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        averageOfRatings(list);
    }

    static void averageOfRatings(List<Double> list){
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double userRating;
        System.out.println("Enter the ratings you want to calculate, when you finish you can enter \"0\" ");
        userRating = input.nextDouble();
        while (userRating != 0){
            if(userRating >= 1 && userRating <= 6){
                list.add(userRating);
                sum += userRating;
            }else{
                System.out.println("Incorrect rating, the rating should be between 1 and 6.");
            }
            userRating = input.nextDouble();
        }
        System.out.println(sum/list.size());
    }
}
