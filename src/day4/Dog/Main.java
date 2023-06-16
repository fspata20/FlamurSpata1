package day4.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("male", "doberman");
        Dog dog1 = new Dog(12, 23, "Dog", "male" , "pitbull");

        dog1.setAge(23);
        System.out.println(dog.getAge());
        dog1.setweight(70);
        System.out.println(dog1.getweight());

    }
}
