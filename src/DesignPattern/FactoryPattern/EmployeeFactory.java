package DesignPattern.FactoryPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String etype) {
        if(etype.equalsIgnoreCase("Web")) {
            return new WebDeveloper("Aditya");
        }
        else if(etype.equalsIgnoreCase("Android")) {
            return new AndroidDeveloper("Rahul");
        }
        return new WebDeveloper("Aditya");
    }
}
