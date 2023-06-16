package Inheritance.Animal;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super("Pisika");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void yieldVoice() {
        System.out.println("Meow ");
    }
}
