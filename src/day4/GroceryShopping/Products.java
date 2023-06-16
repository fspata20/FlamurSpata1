package day4.GroceryShopping;

public class Products {
    private String name;
    private int price;
    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }
    public String toString(){
        return "Name: " + name +
                "price: " + price;
    }
}
