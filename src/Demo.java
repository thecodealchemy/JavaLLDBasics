import DesignPattern.ObserverPattern.Subscriber;
import DesignPattern.ObserverPattern.YtChannel;

class Demo {
    public static void main(String[] args) {
        YtChannel yt =  new YtChannel("ArgonYt");
        Subscriber subscriber = new Subscriber("Aditya");
        Subscriber subscriber2 = new Subscriber("Raj");
        Subscriber subscriber3 = new Subscriber("Sara");

        yt.addObserver(subscriber);
        yt.addObserver(subscriber2);
        yt.addObserver(subscriber3);

        yt.UploadVideo("Apple DIY");
    }
}