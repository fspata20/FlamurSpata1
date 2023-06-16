package day4.Dog;

public class Dog {
    private int age, weight;
    private String name, gender, race;

    public Dog(int age, int weight, String name, String gender, String race) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    public Dog(String gender, String race) {
        this(12, 21, "name", gender, race);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid input for age!");
        }else
            this.age = age;
    }

    public int getweight() {
        return weight;
    }

    public void setweight(int weight) {
        if(weight <= 0)
            System.out.println("Invalid input for weight!");
        else
            this.weight = weight;
    }
    public String toString(){
        return "Age: " + age +
                "Weight: " + weight +
                "Name: " + name +
                "Gender: " + gender +
                "Race: " + race;
     }
}
