package Inheritance.Shape;

public class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public int getPerimeter() {
        return 2 * (width + length);
    }
    public int getArea(){
        return width*length;
    }
}
