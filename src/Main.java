
    public class Main {
    public static void main(String[] args) {
        Identifier a = new Identifier ();
        Identifier b = new Identifier ();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("Identifier.x = " + Identifier.x);
    }

}