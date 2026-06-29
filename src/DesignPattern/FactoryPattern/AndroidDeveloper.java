package DesignPattern.FactoryPattern;

public class AndroidDeveloper implements Employee{
    private final String name;
    public AndroidDeveloper(String name){
        this.name = name;
    }

    public int getSalary(){
        return 5000;
    }
    public String getName() {
        return name;
    }
}
