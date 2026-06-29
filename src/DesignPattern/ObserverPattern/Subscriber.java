package DesignPattern.ObserverPattern;

public class Subscriber implements Observer{
    private final String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Hey " + name + " Video Uploaded: " + message);
    }
}
