package prototype.dbconfig;

public class PrototypeDemo {

    public static void main(String[] args) {
        DatabaseConfig originalConfig = new DatabaseConfig("jdbc:mysql://localhost:3306/dev", "admin", "password");
        DatabaseConfig clonedConfig = originalConfig.clone();

        clonedConfig.setDbUrl("jdbc:mysql://localhost:3306/test");

        System.out.println("Original: " + originalConfig);
        System.out.println("Cloned: " + clonedConfig);
    }
}
