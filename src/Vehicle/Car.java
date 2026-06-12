package Vehicle;

public class Car implements Vehicle{
    public Car(){
        System.out.println("Preparing Car");
    }

    public void start(){
        System.out.println("Starting Car");
    }
    public void stop(){
        System.out.println("Stopping Car");
    }
}
