package factory.dbdriverexample;

/**
 * Factory for creating instances of Database Drivers
 */
public class DatabaseDriverFactory {

    public static DatabaseDriver getDriver(String dbType){
//        if (dbType.equalsIgnoreCase("MYSQL"))
//            return new MySQLDriver();
//        else if (dbType.equalsIgnoreCase("POSTGRES"))
//            return new PostgresDriver();


        return switch (dbType.toUpperCase()){
            case "MYSQL" -> new MySQLDriver();
            case "POSTGRES" -> new PostgresDriver();
            default -> throw new IllegalArgumentException("Unsupported database type: " + dbType);
        };
    }
}
