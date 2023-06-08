import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nunber: ");
        double w = input.nextDouble();
        double h = input.nextDouble();

        System.out.println("Area is: " + (w * h));
        System.out.println("Perimeter is: " + (2 * (w + h)));

    }
}
