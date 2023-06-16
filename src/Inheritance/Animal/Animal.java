package Inheritance.Animal;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void yieldVoice(){
        System.out.println("Animal sound ");
    }
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Puppy");
        animals[1] = new Cat("Pisika");

        for(Animal animal: animals){
            System.out.println(animal.name + " : ");
            animal.yieldVoice();
        }
    }
}