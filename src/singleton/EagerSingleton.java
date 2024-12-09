package singleton;


// Eager initialization (load the instance at class loading time)
// Thread safe
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
