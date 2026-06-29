package DesignPattern.Singleton;

public class Samosa {
    private static Samosa samosa;
    private Samosa(){
        System.out.println("Samosa Created!");
    }

    public static Samosa getInstance(){
        if (samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }
}
