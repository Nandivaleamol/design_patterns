package singleton;

// Multithreading Singleton
// To avoid we have synchronized block which we will implement
public class MultithreadingSingleton {
    private static MultithreadingSingleton instance = null;

    private MultithreadingSingleton() {}

    public static MultithreadingSingleton getInstance() {
        // The Question arises why we have two null checks here
        // Reason for first null check is the same as explained in method level synchronization
        if (instance == null){
            synchronized (MultithreadingSingleton.class){
                if (instance== null){
                    instance = new MultithreadingSingleton();
                }
            }
        }
        return instance;
    }
}
