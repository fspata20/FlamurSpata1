import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        power(n);
    }

    static void power(int n) {
        int power = 1;
        while (power <= n) {
            System.out.print(power + "  ");
            power *= 2;
        }
    }
}