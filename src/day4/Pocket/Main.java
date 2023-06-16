package day4.Pocket;

public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(2000);
        System.out.println(pocket.getMoney());
        pocket.setMoney(4000);
    }
}
