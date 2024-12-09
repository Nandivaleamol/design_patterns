package singleton;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
        // Private constructor to prevent instantiation from outside the class
    }
}
