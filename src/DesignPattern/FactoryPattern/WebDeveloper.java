package DesignPattern.FactoryPattern;

public class WebDeveloper implements Employee{
    private final String name;

    WebDeveloper(String name){
        this.name = name;
    }

    public int getSalary() {
        return 1000;
    }
    public String getName() {
        return name;
    }
}
