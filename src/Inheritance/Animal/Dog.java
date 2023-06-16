package Inheritance.Animal;

class Dog extends Animal{
    private String name;
    public Dog(String name) {
        super("Puppy");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void yieldVoice() {
        System.out.println("Woof  ");
    }
}
