package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YtChannel {
    private final List<Observer> subscribers =  new ArrayList<Observer>();
    private final String name;

    public YtChannel(String name) {
        this.name = name;
    }

    public void UploadVideo(String title){
        for(Observer subscriber: this.subscribers){
            subscriber.notify(name + ": " + title);
        }
    }
    public void addObserver(Observer observer){
        this.subscribers.add(observer);
    }
}
