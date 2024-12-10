package factory;

public class LinuxOperatingSystem implements OperatingSystem{

    public LinuxOperatingSystem(String version, String architecture){
        System.out.println("Linux operating system created: " + version + " " + architecture);
    }
}
