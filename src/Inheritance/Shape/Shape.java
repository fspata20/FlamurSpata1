package Inheritance.Shape;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Shape shape = new Shape("white");
        Rectangle rectangle = new Rectangle("white", 5, 5);
        Circle circle = new Circle("blue", 4.5);
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
    }
}
