package DesignPattern.Singleton;

public class SamosaSynced {
    private static SamosaSynced instance;
    private SamosaSynced(){}
    public static SamosaSynced getInstance(){
        if (instance == null) {
            synchronized (SamosaSynced.class) {
                if (instance == null) {
                    instance = new SamosaSynced();
                }
            }
        }
        return instance;
    }
}
