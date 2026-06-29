package DesignPattern.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable {
    private  String name;
    private  int age;
    private final List<String> emails = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public User clone() throws CloneNotSupportedException {
        return new User(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addEmail(String email) {
        this.emails.add(email);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emails=" + emails +
                '}';
    }
}
