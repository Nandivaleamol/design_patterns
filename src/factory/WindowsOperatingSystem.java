package factory;

public class WindowsOperatingSystem implements OperatingSystem {

    public WindowsOperatingSystem(String version, String architecture){
        System.out.println("Windows OS: version " + version + ", architecture: " + architecture);
    }
}
