package abstractfactory;

import abstractfactory.factory.MacOSFactory;
import abstractfactory.factory.WindowsFactory;
import abstractfactory.factory.GUIFactory;

// Client code
public class Main {

    public static void main(String[] args) {

        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        System.out.println("OS: " + osName);

        if (osName.contains("mac")){
            factory = new MacOSFactory();
        }else {
            factory = new WindowsFactory();
        }

        // Using the factory to create GUI components
        Application application = new Application(factory);
        application.paint();

    }
}
