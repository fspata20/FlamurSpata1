package day6.map;

import java.util.List;

public class Person {
    private String name;
    private String surname;
    private int age;
    private List friends;

    public Person(String name, String surname, int age, List friends) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getFriends() {
        return friends;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}
