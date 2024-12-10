package factory;

public class OperatingSystemFactory {

    private OperatingSystemFactory() {}

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        return switch (type) {
            case "Windows" -> new WindowsOperatingSystem(version, architecture);
            case "Linux" -> new LinuxOperatingSystem(version, architecture);
            default -> throw new IllegalArgumentException("Unsupported operating system type: " + type);
        };
    }
}
