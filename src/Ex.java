import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        fibonacciNumbers(a);
    }
        static void fibonacciNumbers(int a) {
        int n1 = 0;
        int n2 = 1;
        int tot = 0;

        for (int i = 0; i <= a; i++) {
            if(tot <= a){
                System.out.println(tot + "   ");
                tot = n1 + n2;
                n2 = n1;
                n1 = tot;
            }
            else break;
        }
    }

}
