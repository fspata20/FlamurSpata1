import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = input.nextInt();

        if (num <= 1) {
            System.out.println("I am interrupting work! ");
        } else {
            boolean prime = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    prime = true;
                    break;
                }
            }

            if (!prime)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
}
