package DesignPattern.Singleton;

public class SamosaEager {
    private static final SamosaEager instance = new SamosaEager();
    private SamosaEager(){
        System.out.println("SamosaEager Constructor Called");
    }
    public static SamosaEager getInstance(){
        return  instance;
    }

    public static void greet(){
        System.out.println("SamosaEager Greeting");
    }
}
